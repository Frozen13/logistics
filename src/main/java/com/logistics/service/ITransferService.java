package com.logistics.service;

import java.util.List;

import com.logistics.bean.CustomerReceiptInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.logistics.bean.GoodsBill;
import com.logistics.bean.TransferComInfo;
import com.logistics.bean.TransferInfo;

public interface ITransferService {
	
	public boolean addCompany(TransferComInfo transferComInfo);
	
	public Page<TransferComInfo> findAllByPage(Pageable pageable);
	
	public List<GoodsBill> transferGoods(String type, String driverId);
	
	public List<GoodsBill> arriveGoods(String type, String driverId);
	
	public TransferComInfo findByGoodsBillCode(String goodsBillCode);
	
	public boolean addTransferInfo(TransferInfo transferInfo);
	
	public List<GoodsBill> findOnWayBills();
	
	public Page<TransferInfo> findInfoByPage(Pageable pageable);
	
	public boolean addCustomerReceiptInfo(CustomerReceiptInfo customerReceiptInfo);
	
	public Page<CustomerReceiptInfo> findCusRecPage(String customerCode, Pageable pageable);

}
