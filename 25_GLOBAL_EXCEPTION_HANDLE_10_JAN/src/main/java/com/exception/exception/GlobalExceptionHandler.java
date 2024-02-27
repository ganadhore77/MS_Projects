package com.exception.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<AppExcpInfo> handleAE(Exception e){
		
		AppExcpInfo info = new AppExcpInfo();
		
		info.setExCode("EXP001");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<AppExcpInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NoUserFoundExcp.class)
	public ResponseEntity<AppExcpInfo> NoUserFoundExcp(Exception e){
		
		AppExcpInfo info = new AppExcpInfo();
		
		info.setExCode("NO USER FOUND");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<AppExcpInfo>(info,HttpStatus.BAD_REQUEST);
	}
	
}
