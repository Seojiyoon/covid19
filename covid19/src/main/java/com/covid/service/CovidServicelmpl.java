package com.covid.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.covid.dao.CovidDAO;
import com.covid.domain.CovidAgeEntity;
import com.covid.domain.CovidEntity;

@Service
public class CovidServicelmpl implements CovidService {
	
	 @Inject
	 private CovidDAO dao;
	 
	 @Override
	 public CovidAgeEntity list() throws Exception {
		 
		 CovidAgeEntity covid  = new CovidAgeEntity();
		 List<String> ageList = new ArrayList<String>() ;
		 List<CovidEntity> list = dao.list();
		 for (CovidEntity covidEntity : list) {
			if(!ageList.contains( covidEntity.getPatientAge())){
				ageList.add(covidEntity.getPatientAge());
			}
		}
		 covid.setAgeList(ageList);
		 covid.setList(list);
	  return covid;
	 }

}
