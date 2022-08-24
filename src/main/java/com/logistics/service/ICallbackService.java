package com.logistics.service;

import com.logistics.bean.CallbackInfo;

public interface ICallbackService {
	
	public boolean addInfo(CallbackInfo callbackInfo);
	
	public CallbackInfo findDetail(String goodsBillId, String type);

}
