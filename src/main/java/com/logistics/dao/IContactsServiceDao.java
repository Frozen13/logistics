package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.ContactsService;

public interface IContactsServiceDao  extends JpaRepository<ContactsService, Long> {

	public ContactsService findByGoodsBillCode(String goodsBillCode);

}
