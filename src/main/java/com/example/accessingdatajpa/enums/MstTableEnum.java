package com.example.accessingdatajpa.enums;

public enum MstTableEnum {

    SYSTEM_MST("SYSTEM_MST")
    , BROWSER_MST("BROWSER_MST")
    , LANG_MST("LANG_MST");

    private final String tableName;
    MstTableEnum(String tableName){
        this.tableName = tableName;
    }

    public static MstTableEnum valueOfName(String tableName){
        for(MstTableEnum e : MstTableEnum.values()){
            if(e.tableName.equals(tableName)){
                return e;
            }
        }
        throw new IllegalArgumentException("");
    }

}
