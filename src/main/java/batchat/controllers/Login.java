package batchat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import batchat.domain.User;

@Controller
public class Login {
	
	@GetMapping("/")
	public String start(@AuthenticationPrincipal User user) {
		if (user != null) {
			return "redirect:/home";
		}
		return "login";
	}

	
	@GetMapping("/hello")
	@SuppressWarnings("unlikely-arg-type")
	public String getStartPage(
		@AuthenticationPrincipal User user
	) {
		if (user.getRoles().contains("ADMIN")) return "admin";
		if (user.getRoles().contains("GENERAL")) return "general";
		if (user.getRoles().contains("CAPITAN")) return "capitan";
		if (user.getRoles().contains("OBSERVER")) return "observer";
		
		return "soldier";

	}
}
