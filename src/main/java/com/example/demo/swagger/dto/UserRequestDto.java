package com.example.demo.swagger.dto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiModel(description = "All details about the User ")
public class UserRequestDto {

	@ApiModelProperty(notes = "The database generated User name", position = 1, value = "username", example = "karas")
	public String userName;

	@ApiOperation(value = "API info", notes = "API detailed info")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "http status info") })
	@PostMapping("/api/v1")
	public UserRequestDto get(@ApiParam(required = true, value = "請傳入UserRequestDto的格式") @RequestBody UserRequestDto dto) {
		return dto;
	}
}
