package com.logistics.service.impl;

import com.logistics.service.IGoodsReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.logistics.bean.GoodsReceiptInfo;
import com.logistics.dao.IGoodsReceiptInfoDao;

@Transactional
@Service(value = "goodsReceiptService")
public class GoodsReceiptServiceImpl implements IGoodsReceiptService {
	
	@Autowired
	private IGoodsReceiptInfoDao goodsReceiptInfoDao;

	@Override
	public boolean add(GoodsReceiptInfo goodsReceiptInfo) {
		// TODO Auto-generated method stub
		try {
			goodsReceiptInfoDao.save(goodsReceiptInfo);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("货物回执信息添加失败");
			return false;
		}
	}

}
