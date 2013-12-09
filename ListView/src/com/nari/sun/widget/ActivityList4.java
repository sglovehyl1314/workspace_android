package com.nari.sun.widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemSelectedListener;

public class ActivityList4 extends Activity {
	ListView listView;
	private String[] data = { "eoeInstaller", "eoeDouban", "eoeWhere", "eoeInfoAssistant", "eoeDakarGame", "eoeTrack" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		listView = new ListView(this);
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
		setContentView(listView);
		OnItemSelectedListener itemSelectedListener = new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				setTitle("��ѡ�е������:  " + parent.getItemAtPosition(position).toString());

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				setTitle("");

			}

		};
		listView.setOnItemSelectedListener(itemSelectedListener);
	}
}
