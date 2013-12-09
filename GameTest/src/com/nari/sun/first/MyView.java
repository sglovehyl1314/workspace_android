package com.nari.sun.first;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
	private Paint paint;

	public MyView(Context context) {
		super(context);
		paint = new Paint();
		paint.setAntiAlias(true);// �����޾��
		this.setKeepScreenOn(true);// ������Ļ���ֳ���
		paint.setColor(Color.RED);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawColor(Color.BLACK);
		// ������
		Rect rect = new Rect(30, 30, 50, 50);
		canvas.drawRect(rect, paint);
		// ����Բ
		// RectF rectF = new RectF(70f, 30f, 90f, 90f);// RectF ֻ�Ǿ��� float��ʽ ֻ�Ǹ�Rect��ȷ�Ȳ�һ��
		// canvas.drawArc(rectF, 0, 360, true, paint);
		// ��Բ
		canvas.drawCircle(150, 30, 20, paint);// ��Ҳ�ǻ�Բ ����������Ϊ�뾶

		float[] points = new float[] { 200f, 10f, 150f, 30f, 300f, 30f, 400f, 70f };
		// ����
		// canvas.drawLines(points, paint);
		canvas.drawLines(points, 1, 4, paint);// ѡȡ�ض�������������������һ��ֱ��
		// д�ı�
		canvas.drawText("Himi", 230, 30, paint);

	}

}
