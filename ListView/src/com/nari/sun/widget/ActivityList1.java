package com.nari.sun.widget;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityList1 extends Activity {
	ListView listView;
	private String[] data = { "AndroidӦ��רҵ��������:eoeAndroid.com", "eoeAndroid��Ʒ�������:", "eoeInstaller", "eoeDouban", "eoeWhere", "eoeInfoAssistant", "eoeDakarGame", "eoeTrack" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		listView = new ListView(this);
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
		// listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, data));
		// listView.setItemsCanFocus(true);
		// listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		setContentView(listView);
	}

}
