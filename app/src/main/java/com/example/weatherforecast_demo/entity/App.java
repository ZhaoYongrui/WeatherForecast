package com.example.weatherforecast_demo.entity;

/**
 * 天气预报信息实体类
 */
public class App {
    private String time;//数据更新时间
    private String date;//当前日期
    private String message;//当前状态
    private String status;//状态号
    private Data data;//当前日期
    private Forecast forecast;//预报信息对象
    private CityInfo cityInfo;//城市信息对象

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }


    public Forecast getForecast() {
        return forecast;
    }


    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

}
