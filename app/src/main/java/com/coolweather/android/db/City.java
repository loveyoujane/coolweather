package com.coolweather.android.db;

/**
 * Created by Jane on 2018/4/24.
 */

public class City {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return  cityName;
    }
    public void setCityName(){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(){
        this.provinceId = provinceId;
    }

}
