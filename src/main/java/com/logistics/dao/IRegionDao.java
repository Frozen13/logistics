package com.logistics.dao;

import java.util.List;

import com.logistics.bean.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRegionDao extends JpaRepository<Region, Long> {
	
	public Region findById(int id);
	
	public Region findByCity(String city);
	
	@Query(value = "select * from region where id not in (select city_id from cityexpand)", nativeQuery = true)
	public List<Region> findLeftRegions();

}
