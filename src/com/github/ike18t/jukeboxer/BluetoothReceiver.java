package com.github.ike18t.jukeboxer;

import android.app.*;
import android.content.*;
import android.view.*;
import android.widget.*;
import android.os.*;
import android.bluetooth.*;

public class BluetoothReceiver extends BroadcastReceiver {

  public void onReceive(Context context, Intent intent) {
    if(BluetoothDevice.ACTION_FOUND.equals(intent.getAction())) {

      BluetoothDevice device = (BluetoothDevice)intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
      Toast.makeText(context, device.getName(), Toast.LENGTH_LONG).show();
    }
  }
}
