package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.logistics.bean.CustomerBillClear;

public interface ICustomerBillClearDao extends JpaRepository<CustomerBillClear, Long> {
	
	
	public CustomerBillClear findByGoodsBillCode(String billCode);



}