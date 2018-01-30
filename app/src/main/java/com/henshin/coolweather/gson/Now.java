package com.henshin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by henshin on 2018/1/30.
 */

public class Now
{
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
