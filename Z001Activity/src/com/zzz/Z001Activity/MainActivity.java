package com.zzz.Z001Activity;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Button B1,B2,B3;
	private TextView TV1;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TV1=(TextView)findViewById(R.id.mainactivity_textView1);
		
		B1=(Button)findViewById(R.id.mainactivity_button1_gotoaty1);
		B1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(MainActivity.this,Aty1.class);		
	 			i.putExtra("talk1", "see you !");
				startActivity(i);
			}
		});
		
		B2=(Button)findViewById(R.id.mainactivity_button2_gotoaty1);
		B2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {	
				Intent i = new Intent(MainActivity.this,Aty1.class);
			
	 			Bundle Data =new Bundle();
	 			Data.putString("talk1", "byebye");
	 			
	 			i.putExtras(Data);
				startActivity(i);
			}
		});
		
		
		B3=(Button)findViewById(R.id.mainactivity_button3_gotoaty1andresult);
		B3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
	
				Intent i = new Intent(MainActivity.this,Aty1.class);
			
	 			Bundle Data =new Bundle();
	 			Data.putString("talk1", "have fun");
	 			
	 			i.putExtras(Data);

				startActivityForResult(i, 0);
			}
		});
		
	}
//这个函数当startActivityForResult启动的acticity返回时 起作用;requestcode和resultcode为2边的选择码
	@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		   if(data!=null){
			String result = data.getStringExtra("talk2");
			TV1.setText(result);}
			super.onActivityResult(requestCode, resultCode, data);
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
	
	
//1-生命周期流程
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("0start");
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		System.out.println("0resume");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		System.out.println("0pause");

	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		System.out.println("0stop");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		System.out.println("0destroy");
	}
//1-尾
}
