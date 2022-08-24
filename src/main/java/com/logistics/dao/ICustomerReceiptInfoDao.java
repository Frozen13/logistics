package com.logistics.dao;

import com.logistics.bean.CustomerReceiptInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerReceiptInfoDao extends JpaRepository<CustomerReceiptInfo, Long>{
	
	public Page<CustomerReceiptInfo> findByReceiveGoodsPerson(String receiveGoodsPerson, Pageable pageable);

}
