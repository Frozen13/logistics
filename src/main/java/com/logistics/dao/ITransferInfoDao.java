package com.logistics.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.TransferInfo;

public interface ITransferInfoDao extends JpaRepository<TransferInfo, Long> {

	public TransferInfo findByGoodsBillCodeAndTransferStation(String goodsBillCode, String transferStation);
	
	public List<TransferInfo> findByGoodsBillCode(String goodsBillCode);
	
}
