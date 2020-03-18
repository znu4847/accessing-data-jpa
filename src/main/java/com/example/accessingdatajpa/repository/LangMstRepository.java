package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.entity.LangMst;
import com.example.accessingdatajpa.entity.MasterInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LangMstRepository extends CrudRepository<LangMst, String> {



}
