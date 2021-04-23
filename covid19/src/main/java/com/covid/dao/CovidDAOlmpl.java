package com.covid.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.covid.domain.CovidEntity;

@Repository
public class CovidDAOlmpl implements CovidDAO {
	
	 @Inject
	 private SqlSession sql;
	 
	 private static String namespace = "com.covid.mappers.covid";

	@Override
	public List<CovidEntity> list() throws Exception {
		
		return sql.selectList(namespace + ".list");
	}

}
