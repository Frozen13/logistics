package com.logistics.service;

import java.util.List;

import com.logistics.bean.DriverClear;
import com.logistics.bean.ProxyFeeClear;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.logistics.bean.CustomerBillClear;
import com.logistics.bean.ExtraClear;

public interface IClearService {
	
	public List<DriverClear> selectDrclear(String eventName);

	public DriverClear selectByCargoReceiptCode(String goodsBillCode);

	public boolean driClear(DriverClear driverClear);

	public List<CustomerBillClear> selectCusclear(String eventName);

	public CustomerBillClear selectByBillCode(String goodsBillCode);

	public boolean cusClear(CustomerBillClear customerBillClear);

	public List<ProxyFeeClear> selectHelpclear(String eventName);

	public ProxyFeeClear selectByGoodsBillCode(String goodsBillCode);

	public boolean helpClear(ProxyFeeClear proxyFeeClear);

	public boolean saveExtraClear(ExtraClear extraClear);

	public Page<ExtraClear> selectAllExtraClearByPage(Pageable pageable);

}
