package com.example.tacademy.sampleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Tacademy on 2016-08-17.
 */
public class CancelService extends Service {
    public CancelService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int count = intent.getIntExtra("count", 0);
        Toast.makeText(this, "cancel : " + count , Toast.LENGTH_SHORT).show();
        return Service.START_NOT_STICKY;
    }
}