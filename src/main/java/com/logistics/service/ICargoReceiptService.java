package com.logistics.service;

import java.util.List;

import com.logistics.bean.CargoReceipt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.logistics.bean.CargoReceiptDetail;
import com.logistics.bean.GoodsBill;

public interface ICargoReceiptService {
	
	public boolean save(CargoReceipt cargoReceipt);
	
	public List<String> selectAllCodes();
	
	public List<?> selectLeftCodes();
	
	public GoodsBill selectGoodsBill(String goodsRevertBillCode);
	
	public List<CargoReceipt> findByDriverId(String driverId);
	
	public Page<CargoReceipt> selectAll(Pageable pageable);
	
	public Page<CargoReceipt> selectByEvent(String backBillState, Pageable pageable);

	public CargoReceipt selectByCode(String goodsRevertBillCode);
	
	public boolean update(CargoReceipt cargoReceipt);
	
	public boolean submit(CargoReceipt cargoReceipt);
	
	public boolean delete(String goodsRevertBillCode);
	
	public Page<CargoReceipt> findByDriverIdAndState(String driverId, String backBillState, Pageable pageable);
	
	public CargoReceiptDetail findByGoodsBillCode(String goodsBillCode);

}
