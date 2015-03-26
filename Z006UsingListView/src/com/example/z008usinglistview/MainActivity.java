package com.example.z008usinglistview;

import java.util.List;

import android.R.anim;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener  {
	
	private ListView lv;
//	private ArrayAdapter<String> adapter;
	private ArrayAdapter<ListCellData> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		adapter = new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
//		adapter = new ArrayAdapter<String>(this, R.layout.list_cell);
		
		lv = (ListView)findViewById(R.id.mainactivity_listView1);
		lv.setAdapter(adapter);
		
		adapter.add(new ListCellData("小刚", "男", 13));
		adapter.add(new ListCellData("小红", "女", 14));
		
//		adapter.add("hello");
//		adapter.add("see you");
		
		lv.setOnItemClickListener(this);
		
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

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
		ListCellData data = adapter.getItem(position);
		
		Toast.makeText(this, String.format("名字：%s,性别：%s，年龄：%d", data.getUsername(),data.getSex(),data.getAge()), Toast.LENGTH_SHORT).show();		
	}
	

}
