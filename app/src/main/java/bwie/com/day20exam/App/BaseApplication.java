package bwie.com.day20exam.App;

import android.app.Application;

import bwie.com.day20exam.exception.CrashHandler;

/**
 * 功能描述  :
 * 创建时间 : 2017/7/27 9:03
 * 编写人  :  王成哲
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
