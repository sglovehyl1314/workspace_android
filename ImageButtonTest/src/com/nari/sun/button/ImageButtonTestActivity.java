package com.nari.sun.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class ImageButtonTestActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageButton imageButton = (ImageButton) findViewById(R.id.ImageButton);
		imageButton.setBackgroundResource(R.drawable.icon);
		imageButton.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					// ����Ϊ����ʱ�ı���ͼƬ
					view.setBackgroundResource(R.drawable.buttondown);
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					// ��Ϊ̧��ʱ��ͼƬ
					view.setBackgroundResource(R.drawable.buttonup);
				}
				return false;
			}
		});
	}
}