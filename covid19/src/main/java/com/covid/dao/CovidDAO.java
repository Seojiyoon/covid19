package com.covid.dao;

import java.util.List;

import com.covid.domain.CovidEntity;

public interface CovidDAO {
	
	public List<CovidEntity> list() throws Exception; 

}
