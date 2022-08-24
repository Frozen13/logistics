package com.logistics.dao;

import java.util.List;

import com.logistics.bean.ExtraIncome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExtraIncomeDao extends JpaRepository<ExtraIncome, Long>{

    public List<ExtraIncome> findByIncomeMonth(String incomeMonth);
	

}
