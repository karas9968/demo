package com.example.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.DefaultConstants;

@RestController
public class DemoController {

	@RequestMapping(value = "index")
	public String index() {
		return "Hello Guys!!";
	}
	
	@RequestMapping(value = "id/{id}", method = RequestMethod.GET)
	public String id(@PathVariable(value="id") String id) {
		String resultStr = "";
		if(StringUtils.isNoneBlank(id) && DefaultConstants._idList.contains(id)) {
			resultStr = "id="+id;
		}else if(StringUtils.isBlank(id)){
			resultStr = "id is required value.";
		}else if(!DefaultConstants._idList.contains(id)){
			resultStr = "can't find id in defaultConstants:"+id;
		}
		return resultStr;
	}
	
}
