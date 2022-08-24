package com.logistics.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.logistics.bean.BillInfo;
import com.logistics.bean.BillRelease;
import com.logistics.bean.GoodsReceiptInfo;

public interface IBillService {
	
	public Page<BillInfo> findAllByPage(Pageable pageable);
	
	public Page<BillInfo> findNotRelease(Pageable pageable);
	
	public boolean addRelease(BillRelease billRelease);
	
	public boolean addGoodsReceipt(GoodsReceiptInfo goodsReceiptInfo);

}
