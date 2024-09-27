package com.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devopscontroller {
		@GetMapping(value="/get")	
		public String getthis() {
			return "hello";
		}

	}


