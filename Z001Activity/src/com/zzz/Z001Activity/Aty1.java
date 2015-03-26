package com.zzz.Z001Activity;

import javax.security.auth.PrivateCredentialPermission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aty1 extends Activity {

	private Button B1,B2;
	private TextView TV1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty1);
	
		B1 = (Button)findViewById(R.id.aty1_button1_comebackdata);
		B1.setOnClickListener(new android.view.View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				Intent i = new Intent();
				i.putExtra("talk2", "too young");
				
				setResult(0, i);
				finish();
				}
		});

		B2 = (Button)findViewById(R.id.aty1_button2_back);
		B2.setOnClickListener(new android.view.View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();}
		});

		TV1=(TextView)findViewById(R.id.aty1_textView1);
		TV1.setText((getIntent().getStringExtra("talk1")));

	}
		

}
