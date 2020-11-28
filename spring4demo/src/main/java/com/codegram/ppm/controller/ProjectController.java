package com.codegram.ppm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codegram.ppm.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = {"/project_form"})
	public String showProjectForm(Model model) {
		return "project_form";
	}
	
	@RequestMapping(value = "/process_form", method = RequestMethod.POST)
	public String processProjectForm() {
		//Logic for saving form
		return "welcome";
	}
	

}
