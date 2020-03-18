package com.example.accessingdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class SystemMst {

    @Id
    public String id;
    public String name;
    public String type;
    public String key;
    public Integer dispOrder;
    public String delFlag;

}
