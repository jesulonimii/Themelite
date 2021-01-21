package com.erlite.themelite;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class ThemeLite {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public int setTheme, light, dark;

    public ThemeLite(Context context){

        sharedPreferences = context.getSharedPreferences("darkLite", Context.MODE_PRIVATE);

        light  = AppCompatDelegate.MODE_NIGHT_NO;
        dark = AppCompatDelegate.MODE_NIGHT_YES;

        //fetch theme for shared prefs
        setTheme = sharedPreferences.getInt("ThemeValue", 1);

    }

    //save the theme state
    public void saveTheme(Context context){

        setTheme = AppCompatDelegate.getDefaultNightMode();

        sharedPreferences = context.getSharedPreferences("darkLite", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editor.putInt("ThemeValue", setTheme);
        editor.apply();

    }
}
