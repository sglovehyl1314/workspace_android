package com.nari.sun.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity01 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView textView = (TextView) findViewById(R.id.myTextView);
		Button button = (Button) findViewById(R.id.myButton);
		textView.setText("�ҵĵ�һ��TESTVIEW");
		button.setText("�ҵĵ�һ��BUTTON");
	}
}