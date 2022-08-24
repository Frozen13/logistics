package com.logistics.service;

import java.util.List;

import com.logistics.bean.CarCost;
import com.logistics.bean.ContactsService;
import com.logistics.bean.CustomerAmount;
import com.logistics.bean.DriverAmount;
import com.logistics.bean.GoodsBill;
import com.logistics.bean.LineOverall;

public interface IMoniterService {

	List<GoodsBill> selectAllUnArrive();

	List<GoodsBill> selectAllUnTake();

	List<CustomerAmount> selectAllCusAcount();

	List<DriverAmount> selectAllDriAcount();

	List<ContactsService> printAllContactsService();

	List<LineOverall> printAllLineOverall();

	List<CarCost> printAllCarCost();

	CarCost selectByCode(String driverCode);

	ContactsService selectByGoodsBillCode(String goodsBillCode);


}
