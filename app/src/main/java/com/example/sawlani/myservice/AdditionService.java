package com.example.sawlani.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by sawlani on 3/2/15.
 */
public class AdditionService extends Service {
    private final String TAG = "AdditionService";
    private final IAdditionService.Stub mBinder = new IAdditionService.Stub() {
        public int add(int value1, int value2) {
            return (value1 + value2);
        }
    };
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");
    }
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "OnDestroy()");
    }
}
