package com.erlite.themelite;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class ThemeLite {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public int getTheme, dark, light;


    public ThemeLite(Context context){

        sharedPreferences = context.getSharedPreferences("darkLite", Context.MODE_PRIVATE);


        //fetch theme for shared prefs
        getTheme = sharedPreferences.getInt("ThemeValue", 1);

        dark = AppCompatDelegate.MODE_NIGHT_YES;
        light = AppCompatDelegate.MODE_NIGHT_NO;

    }

    //save the theme state
    public void saveTheme(Context context){

        getTheme = AppCompatDelegate.getDefaultNightMode();

        sharedPreferences = context.getSharedPreferences("darkLite", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editor.putInt("ThemeValue", getTheme);
        editor.apply();

    }

    public void setTheme(){
        AppCompatDelegate.setDefaultNightMode(getTheme);
    }

    public void light(){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void dark(){
       AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }
}
