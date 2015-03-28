package com.ZZZ.z020internalstorage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText et;
	private Button B1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et = (EditText) findViewById(R.id.mainactivity_edittext1);
		B1 = (Button) findViewById(R.id.mainactivity_button1);
		readsavedtext();
		B1.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				
				savecurrenttext();	
			}
		});
	}
	
	private void savecurrenttext(){
		try {
			OutputStream os = openFileOutput("data", Context.MODE_PRIVATE);
			os.write(et.getText().toString().getBytes("utf-8"));
			os.flush();
			os.close();
			
			Toast.makeText(this, "保存成功", Toast.LENGTH_LONG).show();
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readsavedtext(){
		
		try {
			InputStream is = openFileInput("data");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			is.close();
			String str = new String(bytes,"utf-8");
			et.setText(str);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
