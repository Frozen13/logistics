package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.TransferComInfo;

public interface ITransferComInfoDao extends JpaRepository<TransferComInfo, Long> {

	public TransferComInfo findByCity(String city);

}
