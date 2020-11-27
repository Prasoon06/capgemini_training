package com.cg.springxmlbaseddemo.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springxmlbaseddemo.domain.Project;
import com.cg.springxmlbaseddemo.service.ProjectService;

public class ApplicationStartup {
	
	

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		ProjectService projectService=(ProjectService)ctx.getBean("projectServiceImpl");
		startApp(projectService);

	}

	private static void startApp(ProjectService projectService) {
		Scanner sc=new Scanner(System.in);
		//ProjectService projectService=new ProjectServiceImpl(); //DI---> Tight Coupling
		int opt;
		String conti;
		do {
			showMenu();
			System.out.println("Enter your choice");
			opt=sc.nextInt();
			switch (opt) {
			case 1:
				Project project=new Project();
				System.out.println("Enter Project ID : ");
				project.setId(sc.nextInt());
				System.out.println("Enter Project Name : ");
				project.setName(sc.next());
				System.out.println("Enter Project Description : ");
				project.setDescription(sc.next());
				projectService.createProject(project);
				System.out.println("Success! Project Created.");
				
				break;
			case 2:
				System.out.println("-------Available Projcts--------");
				List<Project> projects = projectService.getAllProjects();
				for (Project proj : projects) {
					System.out.println(proj);
				}
				break;
			default:
				System.out.println("-------Wrong Choice--------");
				break;
			}
			
			System.out.println("Do you want to continue");
			conti=sc.next();
		}while(conti.equalsIgnoreCase("yes"));
	}

	private static void showMenu() {
		System.out.println("--------Project Menu---------");
		System.out.println("1. Add Project");
		System.out.println("2. List Projects");
		
		
	}

}
