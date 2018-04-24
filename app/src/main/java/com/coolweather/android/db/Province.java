package com.coolweather.android.db;

import Datasupport;

/**
 * Created by Jane on 2018/4/24.
 */

public class Province extends Datasupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return  provinceName;
    }
    public void setProvinceName(){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(){
        this.provinceCode = provinceCode;
    }

}
