package com.nari.sun.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity02 extends Activity {
	private Button button = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		button = (Button) findViewById(R.id.myButton);
		button.setText("START");
		button.setOnClickListener(new MyButtonListener());
	}

	class MyButtonListener implements OnClickListener {

		public void onClick(View v) {
			// TODO Auto-generated method stub
			/*Intent intent = new Intent();
			intent.setClass(Activity02.this, OtherActivity.class);
			Activity02.this.startActivity(intent);*/
			Uri uri = Uri.parse("smsto://0800000123");
			Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
			intent.putExtra("sms_body", "The SMS text");
			Activity02.this.startActivity(intent);
		}

	}
}