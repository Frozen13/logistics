package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.GoodsReceiptInfo;

public interface IGoodsReceiptInfoDao extends JpaRepository<GoodsReceiptInfo, Long> {

}