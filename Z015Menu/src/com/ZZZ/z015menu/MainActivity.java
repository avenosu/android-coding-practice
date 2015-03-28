package com.ZZZ.z015menu;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case R.id.menu_showdialog:
			new AlertDialog.Builder(this).setTitle("标题").setMessage("对话框").setPositiveButton("关闭", null).show();
			break;
		case R.id.menu_showtoast:
			Toast.makeText(this, "消息", Toast.LENGTH_LONG).show();
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
