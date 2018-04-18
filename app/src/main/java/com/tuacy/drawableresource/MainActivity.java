package com.tuacy.drawableresource;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.drawableresource.clip.ClipActivity;
import com.tuacy.drawableresource.scale.ScaleActivity;

public class MainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		findViewById(R.id.button_drawable_resource_clip).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				ClipActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_scale).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				ScaleActivity.startUp(mContext);
			}
		});
	}
}
