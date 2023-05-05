package com.abdalrhmnrefaie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String loginPage() {
		return " Abdalrhmn Refaie....";
	}

}
