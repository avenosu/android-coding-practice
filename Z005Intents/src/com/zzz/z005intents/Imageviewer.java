package com.zzz.z005intents;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Imageviewer extends Activity {
	
	private ImageView iv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		iv = new ImageView(this);
		setContentView(iv);
		
		iv.setImageURI(getIntent().getData());
	}

}
