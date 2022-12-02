package com.oportunities.contacts.oportunities.controlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oportunities.contacts.oportunities.dto.*;
import com.oportunities.contacts.oportunities.entity.Login;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:8686")
public class LoginControllerForm {
	
	public class LoginController {

		@PostMapping
		public ResponseEntity<LoginResponseDto> performLogin(@Valid @RequestBody Login loginRequestDTO){
			return ResponseEntity.ok(new LoginResponseDto("Success !"));
		}
	}
}
