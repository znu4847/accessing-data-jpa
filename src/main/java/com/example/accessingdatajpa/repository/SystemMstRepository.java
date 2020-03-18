package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.entity.MasterInfo;
import com.example.accessingdatajpa.entity.SystemMst;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SystemMstRepository extends CrudRepository<SystemMst, String> {


}
