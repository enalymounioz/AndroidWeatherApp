package com.example.androidweatherapp.Model;

//Model package is a model of JSON from OpenWeatherMaps API
public class Wind {
    private double speed;
    private double deg;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}