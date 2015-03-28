package com.example.z009notification;

import android.animation.AnimatorSet.Builder;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	public static final int NOTIFICATION_ID = 1200;
	
	private Button B1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		B1 = (Button)findViewById(R.id.mainactivity_button1_notification);
		
		B1.setOnClickListener(new OnClickListener() {
			
			private int counter=1;

			@Override
			public void onClick(View v) {
				//核心代码
				counter++;
				android.support.v4.app.NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);
				builder.setSmallIcon(R.drawable.ic_launcher);
				builder.setContentTitle("哇哦，有"+counter+"个新消息");
				builder.setContentText("你已经可以创建新的消息了");
				Notification notification = builder.build();
				NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
				notificationManager.notify(NOTIFICATION_ID, notification);
			}
		});
	}
	
	


}
