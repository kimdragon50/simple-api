package com.mycom.simple.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.web.bind.annotation.RestController;

import com.mycom.simple.model.Simple;

import lombok.extern.slf4j.Slf4j;

@RestController

@Slf4j
public class SimpleController {
	@GetMapping("/")
	public String home(@RequestHeader(value = "referer", required = false) final String referer) {
		
		log.info("==========simple-api home()");
		log.info("##############referer:"+referer);
		
		return "hello world";
		
	}
	@GetMapping("/hello")
	public List<Simple> listBoard(){
		List<Simple> list = new ArrayList<>();
		
		for(int i=0 ; i< 10;i++) {
			list.add(new Simple(i+1,"test-"+i, "contents-"+i));
			System.out.println("for "+i);
		}
		log.info(list.toString());
		return list;
		
	}
	
	@GetMapping("/version")
	public String version(){
		//log.info("version 6.0");
		return "=====  version 3.0.11";
		
	}

}
