// **University of Helsinki**
// Source: https://stackoverflow.com/questions/6391902/how-do-i-start-my-app-on-startup
package com.termux.app;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class TermuxBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent _intent = new Intent(context, TermuxActivity.class);
            _intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(_intent);
        }
    }
}
