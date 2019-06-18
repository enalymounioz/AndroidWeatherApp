package com.example.androidweatherapp.Retrofit;

import com.example.androidweatherapp.Model.WeatherForecastResult;
import com.example.androidweatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

//Queries required for API use
public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);

    @GET("weather")
    Observable<WeatherResult> getWeatherByCityName (@Query("lat") String cityName,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);

    @GET("forcast")
    Observable<WeatherForecastResult> getForecastWeatherBylatLng(@Query("lat") String lat,
                                                           @Query("lon") String lng,
                                                           @Query("appid") String appid,
                                                           @Query("units") String unit);
}