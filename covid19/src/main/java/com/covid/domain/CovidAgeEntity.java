package com.covid.domain;

import java.util.List;

public class CovidAgeEntity {
	
	List<CovidEntity> list;
	List<String> ageList;
	
	public List<CovidEntity> getList() {
		return list;
	}
	public void setList(List<CovidEntity> list) {
		this.list = list;
	}
	public List<String> getAgeList() {
		return ageList;
	}
	public void setAgeList(List<String> ageList) {
		this.ageList = ageList;
	}
	

}
