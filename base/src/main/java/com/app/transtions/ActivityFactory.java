package com.app.transtions;

import com.google.android.gms.location.DetectedActivity;

public class ActivityFactory
{
    private static String toActivityString(int activity) {
        switch (activity) {
            case DetectedActivity.STILL:
                return "STILL";
            case DetectedActivity.WALKING:
                return "WALKING";
            default:
                return "UNKNOWN";
        }
    }

}
