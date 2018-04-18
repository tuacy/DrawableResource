package com.tuacy.drawableresource.shape;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.drawableresource.R;

public class ShapeActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, ShapeActivity.class));
	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shape);
		initView();
	}

	private void initView() {
	}

}
