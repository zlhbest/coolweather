package com.henshin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 用来解析basic的数据格式的类
 * Created by henshin on 2018/1/30.
 */

public class Basic
{
    @SerializedName("city")//用SerializedName注解做一个两个字段的映射
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class  Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
