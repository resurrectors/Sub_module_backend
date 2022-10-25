package com.quizer.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keep_alive")
@CrossOrigin(origins = "http://localhost:3000")
public class KeepAlive {
	
	@GetMapping
	public ResponseEntity<?> keepAlive(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("msg", "keep alive working");
		return new ResponseEntity<>(hm, HttpStatus.OK);
	}

}
