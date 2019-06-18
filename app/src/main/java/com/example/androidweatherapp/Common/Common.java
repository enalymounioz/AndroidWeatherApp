package com.example.androidweatherapp.Common;


import android.location.Location;

import com.example.androidweatherapp.Model.MyList;

import java.text.SimpleDateFormat;
import java.util.Date;

//Frequently used information is found here in the Common java file
public class Common {

    public static final String APP_ID = "6a45931e4ada0de7f7b93b07de506a46";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }


}
