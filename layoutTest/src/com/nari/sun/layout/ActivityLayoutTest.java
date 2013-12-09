package com.nari.sun.layout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ActivityLayoutTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LinearLayout layoutMain = new LinearLayout(this);
		layoutMain.setOrientation(LinearLayout.HORIZONTAL);
		setContentView(layoutMain);

		LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		RelativeLayout relativeLeftLayout = (RelativeLayout) layoutInflater.inflate(R.layout.left, null);
		RelativeLayout relativeRightLayout = (RelativeLayout) layoutInflater.inflate(R.layout.right, null);

		RelativeLayout.LayoutParams relativeParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		layoutMain.addView(relativeLeftLayout, 50, 50);
		layoutMain.addView(relativeRightLayout, relativeParam);

	}

}
