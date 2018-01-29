package com.henshin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by henshin on 2018/1/29.
 * countyName 记录县的名字，weatherId记录的县所对应的天气id，cityId记录当前县所属市的id值
 */

public class County extends DataSupport
{
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getcountyName()
    {
        return this.countyName;
    }
    public void setcountyName(String countyName)
    {
        this.countyName = countyName;
    }
    public int getweatherId()
    {
        return weatherId;
    }
    public void setweatherId(int weatherId)
    {
        this.weatherId = weatherId;
    }
    public int getcityId()
    {
        return cityId;
    }
    public void setcityId(int cityId)
    {
        this.cityId = cityId;
    }
}
