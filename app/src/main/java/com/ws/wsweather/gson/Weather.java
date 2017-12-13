package com.ws.wsweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Admin
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now  now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
