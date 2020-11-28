package com.codegram.ppm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.codegram.ppm.domain.Project;

public class ProjectRowMapper implements ResultSetExtractor {

	@Override
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		Project project=new Project();
		project.setId(rs.getInt("id"));
		project.setName(rs.getString("name"));
		project.setDescription(rs.getString("description"));
		return project;
	}

}
