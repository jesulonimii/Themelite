package com.erlite.themelite;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class ThemeLite {

    SharedPreferences themeSharedPreferences;
    SharedPreferences.Editor editor;
    public int getTheme, isDark, isLight;


    public ThemeLite(Context context){

        themeSharedPreferences = context.getSharedPreferences("darkLite", Context.MODE_PRIVATE);


        //fetch theme for shared prefs
        getTheme = sharedPreferences.getInt("ThemeValue", 1);

        isDark = AppCompatDelegate.MODE_NIGHT_YES;
        isLight = AppCompatDelegate.MODE_NIGHT_NO;

    }

    //save the theme state
    public void saveTheme(Context context){

        getTheme = AppCompatDelegate.getDefaultNightMode();

        themeSharedPreferences = context.getSharedPreferences("darkLite", Context.MODE_PRIVATE);
        editor = themeSharedPreferences.edit();

        editor.putInt("ThemeValue", getTheme);
        editor.apply();

    }

    public void setTheme(){
        AppCompatDelegate.setDefaultNightMode(getTheme);
    }

    public void setLight(){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void setDark(){
       AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }
}
