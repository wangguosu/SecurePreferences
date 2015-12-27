package com.wgy.secure.application;


import android.app.Application;
import android.content.SharedPreferences;
import com.wgy.secure.securepreferences.SecurePreferences;




/**
 * Created by wgy on 2015/7/17.
 */
public class MyApplication extends Application {

    public static MyApplication instance;
    private SharedPreferences securePrefs1000;

    public MyApplication() {
        super();
        instance = this;
    }

    public static MyApplication get() {
        return instance;
    }

    public SharedPreferences getSharedPrefs() {
            if (securePrefs1000 == null) {
                securePrefs1000 = new SecurePreferences(this, "wgy", "pref-file");
            }
        return securePrefs1000;
    }

}
