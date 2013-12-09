package com.nari.sun.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityIntentTestActivity extends Activity {

	private Button button1;
	private Button button2;

	private static final int REQUEST_CODE = 1;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent1 = new Intent(ActivityIntentTestActivity.this, Activity1.class);
				intent1.putExtra("activityMain", "��������activityMain");
				startActivityForResult(intent1, REQUEST_CODE);

			}
		});
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				setTitle("������ActivityMain");
				Intent intent2 = new Intent(ActivityIntentTestActivity.this, Activity2.class);
				startActivity(intent2);

			}
		});

		setTitle("ActivityMain");
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == REQUEST_CODE) {
			if (resultCode == RESULT_CANCELED)
				setTitle("ȡ��");
			else if (resultCode == RESULT_OK) {
				String temp = null;
				Bundle extras = data.getExtras();
				if (extras != null) {
					temp = extras.getString("store");
				}
				setTitle(temp);
			}
		}
	}

}