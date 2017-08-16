package com.example.android.quakereport;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Adrian on 8/15/2017.
 */

public class Earthquake {
    private double magnitude;
    private  String location;
    private long time;
    private String url;

    public String getUrl() {
        return url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTime() {
        return time;
    }

    public Earthquake(double magnitude, String location, long time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.time= time;
        this.url= url;
    }
}
