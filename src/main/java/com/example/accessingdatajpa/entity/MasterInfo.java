package com.example.accessingdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MasterInfo {

    @Id
    public String masterInfoId;
    public String masterName;
    public String tableName;
    public String columnName;
    public String key;
    public Integer dispOrder;
    public String delFlag;

}
