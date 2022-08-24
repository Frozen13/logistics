package com.logistics.dao;


import com.logistics.bean.ProxyFeeClear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProxyFeeClearDao extends JpaRepository<ProxyFeeClear, Long> {
	
	public ProxyFeeClear findByGoodsBillCode(String goodsBillCode);
	
	
	
}