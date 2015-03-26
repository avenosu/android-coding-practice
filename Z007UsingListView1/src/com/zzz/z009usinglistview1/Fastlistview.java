package com.zzz.z009usinglistview1;

import android.app.ListActivity;
import android.os.Bundle;

public class Fastlistview extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//自定义主布局
		setContentView(R.layout.fastlistview_activity);
//
		setListAdapter(new Useradapter(this));
	}

}
