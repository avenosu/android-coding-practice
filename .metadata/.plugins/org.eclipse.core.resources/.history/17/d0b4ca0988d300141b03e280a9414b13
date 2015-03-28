package com.ZZZ.z010multtoach;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	private FrameLayout root;
	private ImageView I1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		root = (FrameLayout)findViewById(R.id.mainactivity_framelayout1);
		I1 = (ImageView)findViewById(R.id.mainactivity_imageview1_picture);
		root.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					System.out.println("action down");
					break;
				case MotionEvent.ACTION_MOVE:
					System.out.println("action move");
					
					System.out.println(String.format("x:%f,y:%f",event.getX(),event.getY()));
					
					FrameLayout.LayoutParams lm = (android.widget.FrameLayout.LayoutParams) I1.getLayoutParams();
					lm.leftMargin = (int) event.getX();
					lm.topMargin = (int) event.getY();
					
					I1.setLayoutParams(lm);
					
					break;
				case MotionEvent.ACTION_UP:
					System.out.println("action up");
					break;
				}
				
				return true;
			}
		});
	}


}
