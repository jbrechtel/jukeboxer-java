package com.github.ike18t.jukeboxer;

import android.app.*;
import android.os.Bundle;
import android.content.*;
import android.view.*;
import android.widget.*;
import android.os.*;
import android.bluetooth.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void startDiscovery(View view)
    {
      BluetoothReceiver receiver = new BluetoothReceiver();
      IntentFilter bluetoothFilter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
      registerReceiver(receiver, bluetoothFilter);
      BluetoothAdapter.getDefaultAdapter().startDiscovery();

    }
}

