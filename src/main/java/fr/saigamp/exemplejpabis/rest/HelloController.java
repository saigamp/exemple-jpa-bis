package fr.saigamp.exemplejpabis.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Bienvenue à ta toi, membre du BIS!";
	}

}