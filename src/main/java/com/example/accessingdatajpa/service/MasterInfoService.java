package com.example.accessingdatajpa.service;

import com.example.accessingdatajpa.entity.MasterInfo;
import com.example.accessingdatajpa.repository.MasterInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MasterInfoService {

    /**
     * test
     */
    @Autowired
    MasterInfoRepository miRepo;

    public List<MasterInfo> getMasterInfoList(){
        // Create an empty list
        List<MasterInfo> list = new ArrayList<>();

        // Add each element of iterator to the List
        Iterable<MasterInfo> sel = miRepo.findByDelFlag("0");
        sel.forEach(list::add);
        return list;
    }

    public List getAllMstInfoList(){

        return null;
    }

    public class MstInfo{

        public String id;

        public String label;

        public Integer dispOrder;

        public String value;

        public List<MstInfo> mstInfoList;

    }


}
