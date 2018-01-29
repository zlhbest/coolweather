package com.henshin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by henshin on 2018/1/29.
 * id是每个实体类中应该有的字段，provinceName是记录的省份，provinceCode是记录省的代号
 * LitePal中每一个实体类都是必须继承自DataSupport的
 */

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private  int provinceCode;
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getProvinceName()
    {
        return this.provinceName;
    }
    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }
    public int getProvinceCode()
    {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode)
    {
        this.provinceCode = provinceCode;
    }
}
