package com.oguzkurtcebe.oauth.controller;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/user")
	public Principal user(Principal principal) {
			return principal;
	}

	@RequestMapping("/login")
	public ResponseEntity<?>login(){
		String str="Login page";
		return ResponseEntity.ok(str);
	}

}
