package com.nari.sun.widget;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityList3 extends ListActivity {
	private String[] data = {};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list3);

		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
	}

	protected void onListItemClick(ListView listView, View v, int position, long id) {
		super.onListItemClick(listView, v, position, id);
		setTitle(listView.getItemAtPosition(position).toString());
	}
}
