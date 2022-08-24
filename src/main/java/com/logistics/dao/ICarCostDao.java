package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.CarCost;

public interface ICarCostDao extends JpaRepository<CarCost, Long>{

	public CarCost findByDriverCode(String driverCode);


}
