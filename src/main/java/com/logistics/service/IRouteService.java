package com.logistics.service;

import java.util.List;

import com.logistics.bean.RouteInfo;

public interface IRouteService {
	
	public void generateRoute();
	
	public List<RouteInfo> findAllRouteInfos();

}
