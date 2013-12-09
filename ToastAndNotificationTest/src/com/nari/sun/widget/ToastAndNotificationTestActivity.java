package com.nari.sun.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ToastAndNotificationTestActivity extends Activity {

	OnClickListener listener1 = null;
	OnClickListener listener2 = null;

	Button button1;
	Button button2;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		listener1 = new OnClickListener() {
			public void onClick(View v) {
				setTitle("学习Notification");
				Intent intent = new Intent(ToastAndNotificationTestActivity.this, ActivityMainNotification.class);
				startActivity(intent);

			}
		};
		listener2 = new OnClickListener() {
			public void onClick(View v) {
				setTitle("学习Toast");
				Intent intent = new Intent(ToastAndNotificationTestActivity.this, ActivityToast.class);
				startActivity(intent);

			}
		};
		setContentView(R.layout.main);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(listener1);
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(listener2);
	}
}