package cn.boji9.doubanmoive;

import android.app.Application;

import com.aitangba.swipeback.ActivityLifecycleHelper;

/**
 * Created by wax on 2017/9/14.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(ActivityLifecycleHelper.build());
    }
}
