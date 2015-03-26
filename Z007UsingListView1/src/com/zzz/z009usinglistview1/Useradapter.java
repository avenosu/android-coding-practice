package com.zzz.z009usinglistview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Useradapter extends BaseAdapter {
	
	private Context context = null;
	
	public Useradapter(Context context){
		this.context = context;
	}
	
	public Context getContext(){
		return context;
	}

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
			ll = (LinearLayout)LayoutInflater.from(getContext()).inflate(R.layout.iconlistview, null);
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

}
