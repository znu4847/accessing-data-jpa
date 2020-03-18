package com.example.accessingdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class LangMst {

    @Id
    public String id;
    public String name;
    public Integer dispOrder;
    public LocalDate fromDate;
    public LocalDate toDate;
    public String delFlag;

}
