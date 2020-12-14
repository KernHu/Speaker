package com.znt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

import java.util.List;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/14/20 8:45 PM
 * describe: This is...
 */

public class LocationUtils {

    /**
     * 定位：得到位置对象
     *
     * @return
     */
    public  static double[] getLastKnownLocation(Context context) {
        double[] location = new double[2];
        //获取地理位置管理器
        LocationManager mLocationManager = (LocationManager) context.getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
        List<String> providers = mLocationManager.getProviders(true);
        Location bestLocation = null;
        for (String provider : providers) {
            @SuppressLint("MissingPermission") Location l = mLocationManager.getLastKnownLocation(provider);
            if (l == null) {
                continue;
            }
            if (bestLocation == null || l.getAccuracy() < bestLocation.getAccuracy()) {
                bestLocation = l;
                double longitude = bestLocation.getLongitude();
                double latitude = bestLocation.getLatitude();
                location[0] = longitude;
                location[1] = latitude;
            }
        }
        return location;
    }
}
