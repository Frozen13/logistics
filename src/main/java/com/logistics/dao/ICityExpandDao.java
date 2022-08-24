package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.CityExpand;

public interface ICityExpandDao extends JpaRepository<CityExpand, Long> {
	
	public CityExpand findByCityId(int cityId);
	
	public CityExpand findById(int id);

}
