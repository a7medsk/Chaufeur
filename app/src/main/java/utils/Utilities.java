package utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mapbox.mapboxsdk.geometry.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by a7med on 28/10/2017.
 */

public class Utilities {


    public static final String PREFS_NAME = "MyPrefsFile";

    public static String getAdressFormat(String adress) {
        String tab[] = adress.split(",");
        return (tab[0] + " " + getPostCode(tab[2]) + tab[1]);
    }

    public static String getPostCode(String adress) {
        String tab[] = adress.split(" ");
        return (tab[tab.length - 1]);
    }


}