package com.logistics.dao;

import java.util.List;

import com.logistics.bean.FinanceFee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFinanceFeeDao extends JpaRepository<FinanceFee, Long>{

	public List<FinanceFee> findByPayoutMonth(String PayoutMonth);
}
