package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.dto.Person;
import com.test.service.IPersonService;

@Controller
@RequestMapping("/")
public class PersonController {
	@Autowired
	private IPersonService personService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savePersonController(@ModelAttribute("userForm") Person person) {
		return personService.checkName(person);
	}
}
