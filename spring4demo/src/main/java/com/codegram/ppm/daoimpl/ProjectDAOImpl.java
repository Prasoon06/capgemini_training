package com.codegram.ppm.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.codegram.ppm.dao.BaseDAO;
import com.codegram.ppm.dao.ProjectDAO;
import com.codegram.ppm.domain.Project;
import com.codegram.ppm.rowmapper.ProjectRowMapper;
@Repository
public class ProjectDAOImpl extends BaseDAO implements ProjectDAO {

	@Override
	public void save(Project project) {
		String sql = "insert into projects(id,name,description) values (:id,:name,:description)";
		Map<String, Object> map= new HashMap<>();
		map.put("id", project.getId());
		map.put("name", project.getName());
		map.put("description", project.getDescription());
		
		SqlParameterSource ps=new MapSqlParameterSource(map);
		getNamedParameterJdbcTemplate().update(sql, ps);

	}

	@Override
	public List<Project> findAll() {
		String sql="select * from projects";
		List<Project> projects = getJdbcTemplate().query(sql, new ProjectRowMapper());
		return projects;
	}

}
