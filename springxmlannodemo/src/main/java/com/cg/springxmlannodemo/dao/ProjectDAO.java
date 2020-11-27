package com.cg.springxmlannodemo.dao;

import java.util.List;

import com.cg.springxmlannodemo.domain.Project;

public interface ProjectDAO {

	public void save(Project project);

	public List<Project> findAll();

	public void delete(Project project);

	public void update(Project project);

}
