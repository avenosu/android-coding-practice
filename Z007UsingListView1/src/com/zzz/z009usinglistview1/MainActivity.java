package com.zzz.z009usinglistview1;

import android.app.Activity;
import android.os.Bundle;
import android.provider.DocumentsContract.Root;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ListView lv ;
	private BaseAdapter adapter = new BaseAdapter() {
		
		private String[] data = new String[]{"1","2","3","4","5","6","7","8","9","10"};
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
//内存优化，convertView存放了回收的textview类，需要用的时候可以拿回来			
			TextView tv = null;
			if(convertView==null){
				tv = new TextView(MainActivity.this);
			}
			else{
				tv = (TextView)convertView;
			}
//》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》
			System.out.println(">>>>>>>>");
			tv.setTextSize(50);
			tv.setText(getItem(position));
			
			
			return tv;
		}
		
		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}
		
		@Override
		public String getItem(int position) {
			// TODO Auto-generated method stub
			return data[position];
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return data.length;
		}
	};
	private BaseAdapter adapter1 = new BaseAdapter() {
		
		private User[] data = new User[]{
				new User("img1", "doc img1", R.drawable.img1),
				new User("img2", "doc img2", R.drawable.img2),
				new User("img3", "doc img3", R.drawable.img3),
				new User("img4", "doc img4", R.drawable.img4),
		};
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LinearLayout ll = null;
			if(convertView!=null){
				ll = (LinearLayout)convertView;
			}
			else{
				ll = (LinearLayout)LayoutInflater.from(MainActivity.this).inflate(R.layout.iconlistview, null);
			}
			
			User data = (User)getItem(position);
			ImageView icon = (ImageView)ll.findViewById(R.id.mainactivity_imageview1_icon);
			TextView name = (TextView)ll.findViewById(R.id.mainactivity_bigtextview1_name);
			TextView doc = (TextView)ll.findViewById(R.id.mainactivity_smalltextview1_doc);
			
			icon.setImageResource(data.iconid);
			name.setText(data.name);
			doc.setText(data.doc);
			
			return ll;
			
		}
		
		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}
		
		@Override
		public User getItem(int position) {
			// TODO Auto-generated method stub
			return data[position];
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return data.length;
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv = (ListView)findViewById(R.id.mainactivity_listView1);
		lv.setAdapter(new Useradapter(this));
		}

}

