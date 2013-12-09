package com.nari.sun.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LayoutTestActivity extends Activity {
	private Button button0 = null;
	private Button button1 = null;
	private Button button2 = null;
	private Button button3 = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent0 = new Intent(LayoutTestActivity.this, FrameLayoutActivity.class);
				setTitle("Frameout的使用");
				startActivity(intent0);
			}
		});
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent1 = new Intent(LayoutTestActivity.this, RelativeLayoutActivity.class);
				startActivity(intent1);
			}
		});

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				setTitle("这是ActivityLayoutTest");
				Intent intent2 = new Intent(LayoutTestActivity.this, ActivityLayoutTest.class);
				startActivity(intent2);
			}
		});
		button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent3 = new Intent(LayoutTestActivity.this, TableLayoutActivity.class);
				startActivity(intent3);
			}
		});
	}
}