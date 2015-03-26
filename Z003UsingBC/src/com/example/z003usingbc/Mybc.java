package com.example.z003usingbc;

import android.R.string;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Mybc extends BroadcastReceiver {
	
	public static final String ACTION = "com.exanple.z003usingbc.intent.action.MYBC";

	@Override
	public void onReceive(Context context, Intent intent) {
		System.out.println("on receive = "+intent.getStringExtra("talk1"));
	}

}
