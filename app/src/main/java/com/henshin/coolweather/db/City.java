package com.henshin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by henshin on 2018/1/29.
 * cityName记录城市的名字，citycode记录城市的代号，provinceid是记录当前城市所属省的id
 */

public class City extends DataSupport
{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getcityName()
    {
        return this.cityName;
    }
    public void setcityName(String cityName)
    {
        this.cityName = cityName;
    }
    public int getcityCode()
    {
        return cityCode;
    }
    public void setcityCode(int cityCode)
    {
        this.cityCode = cityCode;
    }
    public int getprovinceId()
    {
        return provinceId;
    }
    public void setprovinceId(int provinceId)
    {
        this.provinceId = provinceId;
    }


}
