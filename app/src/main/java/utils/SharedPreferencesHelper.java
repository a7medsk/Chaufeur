/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package utils;

import android.content.SharedPreferences;

import java.util.Calendar;

import static android.content.Context.MODE_PRIVATE;

/**
 *  Helper class to manage access to {@link SharedPreferences}.
 */
public class SharedPreferencesHelper {



    // The injected SharedPreferences implementation to use for persistence.
    private final SharedPreferences mSharedPreferences;

    /**
     * Constructor with dependency injection.
     *
     * @param sharedPreferences The {@link SharedPreferences} that will be used in this DAO.
     */
    public SharedPreferencesHelper(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }


    public  boolean savehashmap(String hashMapString){
        // Start a SharedPreferences transaction.
        //save in shared prefs
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString("hashString", hashMapString);


        // Commit changes to SharedPreferences.
        return editor.commit();


    }


    public String loadHashmap() {
        // Get data from the SharedPreferences.
        String name = mSharedPreferences.getString("hashString", "");


        return name;
    }
}
