package com.example.a7med.chaufeur;

import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import utils.Utilities;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static utils.Utilities.getAdressFormat;
import static utils.Utilities.getPostCode;
import static org.mockito.Mockito.mock;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
public class UtlitieUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void TestgetAdressFormat() throws Exception {
        String adress = "50 Rue des Vignes, Nanterre, Hauts-de-Seine 92000,France";

        assertEquals("50 Rue des Vignes 92000 Nanterre", getAdressFormat(adress));


    }

    @Test
    public void TestgetPostCode() throws Exception {
        String adress = "Hauts-de-Seine 92000";

        assertEquals("92000", getPostCode(adress));

    }

    @Test
    public void TestreverseGeocode() throws Exception {
        String adress = "Hauts-de-Seine 92000";

        assertEquals("92000", getPostCode(adress));

    }



    /**
     * Creates a mocked SharedPreferences.
     */
//    private void createMockSharedPreference() {
//        // Mocking reading the SharedPreferences as if mMockSharedPreferences was previously written
//        // correctly.
//        final SharedPreferences sharedPrefs = Mockito.mock(SharedPreferences.class);
//        final Context context = Mockito.mock(Context.class);
//
//        Mockito.when(context.getSharedPreferences(
//                anyString(),anyInt()).thenReturn(sharedPrefs));
//    }


//    @Before
//    public void before() throws Exception {
//
//
//        this.sharedPrefs = Mockito.mock(SharedPreferences.class);
//        this.context = Mockito.mock(Context.class);
//        Mockito.when(context.getSharedPreferences(anyString(), anyInt())).thenReturn(sharedPrefs);
//    }



//    @Test
//    public void sharedPreferencesHelper_savehashmap() {
//        // Read personal information from a broken SharedPreferencesHelper
//
//        Context context = mock(Context.class);
//        boolean success =
//                Utilities.savehashmap(context, "dsds");
//        assertThat("Makes sure writing to a broken SharedPreferencesHelper returns false", success,
//                is(false));
//    }
}