package com.nari.sun.widget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityList2 extends Activity {

	private List<Map<String, Object>> data;
	private ListView listView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		PrepareData();
		listView = new ListView(this);
		SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.list_item, new String[] { "����", "�Ա�" }, new int[] { R.id.mview1, R.id.mview2 });
		listView.setAdapter(adapter);
		setContentView(listView);

		OnItemClickListener listener = new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				setTitle(parent.getItemAtPosition(position).toString());

			}
		};
		listView.setOnItemClickListener(listener);
	}

	private void PrepareData() {
		data = new ArrayList<Map<String, Object>>();
		Map<String, Object> item;
		item = new HashMap<String, Object>();
		item.put("����", "����С����");
		item.put("�Ա�", "��");
		data.add(item);
		item = new HashMap<String, Object>();
		item.put("����", "����ͬѧ");
		item.put("�Ա�", "��");
		data.add(item);
		item = new HashMap<String, Object>();
		item.put("����", "С��ʦ��");
		item.put("�Ա�", "Ů");
		data.add(item);
	}
}
