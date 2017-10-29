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
        return (tab[0] + " "+getPostCode(tab[2])+tab[1]);
    }

    public static String getPostCode(String adress) {
        String tab[] = adress.split(" ");
        return (tab[tab.length - 1]);
    }


    public static void savehashmap(Context context, String hashMapString)
    {



        //convert to string using gson
//        Gson gson = new Gson();
//        String hashMapString = gson.toJson(testHashMap);

        //save in shared prefs
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        prefs.edit().putString("hashString", hashMapString).commit();

        //get from shared prefs


    }

    public static String loadHashmap(Context context) {

        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String storedHashMapString = prefs.getString("hashString", "oopsDintWork");
        return (storedHashMapString);

//        java.lang.reflect.Type type = new TypeToken<HashMap<String, String>>(){}.getType();
//        HashMap<String, String> testHashMap2 = gson.fromJson(storedHashMapString, type);

        //use values
      //  String toastString = testHashMap2.get("key1") + " | " + testHashMap2.get("key2");
    }

//    public static ArrayList<String> Last15FromHashMap(HashMap<String, LatLng> hashMap) {
//        ArrayList<String> adresses=null;
//        for (Map.Entry<String,LatLng> e : hashMap.entrySet()) {
//            adresses.add(e.getKey());
//            //menu.add(e.getKey());
//        }
//        int i=0;
//        while (adresses.size() > 15) {
//            adresses.remove(i);
//            i++;
//        }
//        return (adresses);
//    }
}
