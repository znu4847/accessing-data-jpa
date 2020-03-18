package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.entity.BrowserMst;
import com.example.accessingdatajpa.entity.MasterInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrowserMstRepository extends CrudRepository<BrowserMst, String> {

}
