package com.example.multilingual;

import android.app.Application;

import com.zxy.zxymultilingual.MultiLanguageUtil;

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiLanguageUtil.init(this);
    }
}
