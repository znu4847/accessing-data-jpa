package com.example.accessingdatajpa.controller;

import com.example.accessingdatajpa.entity.MasterInfo;
import com.example.accessingdatajpa.service.MasterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MasterInfoController {

    @Autowired
    MasterInfoService service;

    @CrossOrigin
    @GetMapping("hello")
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }


    @CrossOrigin
    @GetMapping("mstList")
    public ResponseEntity<?> mstList(){
        List<MasterInfo> mstList = service.getMasterInfoList();
        return new ResponseEntity<>(mstList, HttpStatus.OK);
    }



}
