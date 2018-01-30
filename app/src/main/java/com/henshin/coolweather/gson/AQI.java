package com.henshin.coolweather.gson;

/**
 * Created by henshin on 2018/1/30.
 */

public class AQI
{
    public AQICity city;
    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
