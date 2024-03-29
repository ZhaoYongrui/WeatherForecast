package com.example.weatherforecast_demo.entity;

import java.util.List;

/**
 * 详细天气数据实体类
 */
public class Data {
    private String shidu;//湿度
    private String pm25;
    private String pm10;
    private String quality;//空气质量
    private String wendu;//温度
    private String ganmao;//提示信息
    private Yesterday yesterday;
    private List<Forecast> Forecast;

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setForecast(List<Forecast> forecast) {
        Forecast = forecast;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getShidu() {
        return shidu;
    }

    public String getPm25() {
        return pm25;
    }

    public String getQuality() {
        return quality;
    }

    public String getGanmao() {
        return ganmao;
    }

    public String getPm10() {
        return pm10;
    }

    public String getWendu() {
        return wendu;
    }

    public List<Forecast> getForecast() {
        return Forecast;
    }
}
