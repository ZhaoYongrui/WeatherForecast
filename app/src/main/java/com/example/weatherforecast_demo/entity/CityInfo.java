package com.example.weatherforecast_demo.entity;

/**
 * 城市信息实体类
 */
public class CityInfo{
    private String city;//城市名
    private String cityId;//城市码
    private String parent;//省份城市
    private String updateTime;//更新时间

    public void setCity(String city) {
        this.city = city;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCity() {
        return city;
    }

    public String getCityId() {
        return cityId;
    }

    public String getParent() {
        return parent;
    }

    public String getUpdateTime() {
        return updateTime;
    }
}
