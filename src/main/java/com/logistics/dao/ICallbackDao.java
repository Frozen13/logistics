package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.CallbackInfo;

public interface ICallbackDao extends JpaRepository<CallbackInfo, Long> {
	
	public CallbackInfo findByGoodsBillIdAndType(String goodsBillId, String type);
	
}
