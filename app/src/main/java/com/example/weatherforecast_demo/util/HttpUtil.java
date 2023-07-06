package com.example.weatherforecast_demo.util;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 网络请求工具类，用来获取背景
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

    public static String doGet() {
        String result = "";
        BufferedReader reader = null;
        String JSONString = "";
        try {
            HttpURLConnection httpURLConnection = null;
            String url = "http://t.weather.sojson.com/api/weather/city/101030100";
            URL requestUrl = new URL(url);
            httpURLConnection = (HttpURLConnection) requestUrl.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            reader = new BufferedReader(new java.io.InputStreamReader(inputStream));
            String line = "";
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                Log.d("Http", line);
                builder.append("\n");
            }
            if (builder.length() == 0) {
                return null;
            }
            result = builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
