package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.IncomeMonthlyTemp;

public interface IIncomeMonthlyTempDao extends JpaRepository<IncomeMonthlyTemp, Long>{
	
	public IncomeMonthlyTemp findByMonth(String month);
}
