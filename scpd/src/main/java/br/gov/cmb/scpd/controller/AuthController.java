package br.gov.cmb.scpd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.scpd.bean.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AuthController {

	@GetMapping(path = "/v1/basicauth")
	public AuthenticationBean homeBean() {
		return new AuthenticationBean("You are authenticated");
	}	
}
