package com.example.demo.swagger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.swagger.dto.UserRequestDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="DemoSwaggerController",description="類別檔案說明")
@RestController
public class DemoSwaggerController {
	
	@ApiOperation(value="My first api with swagger", notes="API說明文字")
	@PostMapping("/api/v1")
	public ResponseEntity checkUserName(@RequestBody UserRequestDto dto){
		
		
		return ResponseEntity.ok(dto);
	}
}
