package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.entity.MasterInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MasterInfoRepository extends CrudRepository<MasterInfo, String> {

    public List<MasterInfo> findByDelFlag(String delFlag);


}
