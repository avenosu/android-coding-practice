package com.ZZZ.z002usingservice;

import java.security.Principal;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import android.support.v4.app.TaskStackBuilder;

public class service001 extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		System.out.println("onbind");
		return service001binder;
	}
	
	private final Service001binder service001binder = new Service001binder();
	public class Service001binder extends Binder{
		
		public service001 getservice(){
			return service001.this;
		}
		
	}
	

	
	public int getcurrentnumber(){
		return i ;
	}

	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		System.out.println("create service001");
		
		startTimer();
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		System.out.println("destroy service001");
		
		stopTimer();
	}
	
	private Timer timer=null;
	private TimerTask task=null;
	private int i = 0;
	
	public void startTimer(){
		if(timer==null){
			timer = new Timer();
			task = new TimerTask(){
				@Override
				public void run() {
					i++;
					System.out.println(i);
				}
				};
		timer.schedule(task,1000,1000);	
		}
	}
	
	public void stopTimer(){
		if(timer!=null){
			task.cancel();
			timer.cancel();
			
			task = null;
			timer = null;
		}
	}
	
	

}
