package com.henshin.coolweather.util;

import android.text.TextUtils;

import com.henshin.coolweather.db.City;
import com.henshin.coolweather.db.County;
import com.henshin.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 我们这里提供三种方法，handleProvinceResponse和handleCityResponse和handleCountyResponse，分别用于解析和处理服务器的数据，先使用jsonarray和jsonobject解析出来然后
 * 组装成实体类对象，再调用save方法存到数据库中
 * Created by henshin on 2018/1/29.
 */

public class Utility
{
    /**
     * 解析和处理服务器返回的省级数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response)
    {
        if(!TextUtils.isEmpty(response))
        {
            try
            {
                JSONArray allProvinces = new JSONArray(response);
                for(int i = 0;i<allProvinces.length();i++)
                {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     * @param response
     * @param provinceID
     * @return
     */
    public static boolean handleCityResponse(String response,int provinceID)
    {
        if(!TextUtils.isEmpty(response))
        {
            try
            {
                JSONArray allCities = new JSONArray(response);
                for(int i = 0;i<allCities.length();i++)
                {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setcityName(cityObject.getString("name"));
                    city.setcityCode(cityObject.getInt("id"));
                    city.setprovinceId(provinceID);
                    city.save();
                }
                return true;
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     * @param response
     * @param cityId
     * @return
     */
    public static boolean handleCountyResponse(String response,int cityId)
    {
        if(!TextUtils.isEmpty(response))
        {
            try
            {
                JSONArray allCounty = new JSONArray(response);
                for(int i = 0;i<allCounty.length();i++)
                {
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setcountyName(countyObject.getString("name"));
                    county.setweatherId(countyObject.getInt("id"));
                    county.setcityId(cityId);
                    county.save();
                }
                return true;
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        return false;
    }

}
