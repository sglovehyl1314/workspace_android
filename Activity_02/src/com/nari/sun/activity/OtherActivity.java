package com.nari.sun.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
	private TextView textView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		textView = (TextView) findViewById(R.id.myTextView);
		textView.setText(R.string.other);
	}

}
