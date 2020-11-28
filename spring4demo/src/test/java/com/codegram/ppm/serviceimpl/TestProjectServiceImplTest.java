package com.codegram.ppm.serviceimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegram.ppm.configuration.SpringRootConfig;
import com.codegram.ppm.domain.Project;
import com.codegram.ppm.service.ProjectService;

public class TestProjectServiceImplTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext apc=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ProjectService projectService =  apc.getBean(ProjectService.class);
		Project project=new Project();
		project.setId(102);
		project.setName("Second Project");
		project.setDescription("Second Project Description");
		projectService.createProject(project);
		System.out.println("Project Created");
		apc.close();
		
		

	}

}
