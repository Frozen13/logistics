package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.BillRelease;

public interface IBillReleaseDao extends JpaRepository<BillRelease, Long> {

}
