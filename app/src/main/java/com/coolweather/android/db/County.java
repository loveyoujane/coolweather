package com.coolweather.android.db;

/**
 * Created by Jane on 2018/4/24.
 */

public class County {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return  countyName;
    }
    public void setCountyName(){
        this.countyName = countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(){
        this.cityId = cityId;
    }


}
