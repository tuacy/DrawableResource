package com.tuacy.drawableresource.LevelListDrawable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.tuacy.drawableresource.R;

public class LevelListDrawableActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, LevelListDrawableActivity.class));
	}

	private ImageView mImageWifi;
	private ImageView mImageVolume;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_list);
		initView();
	}

	private void initView() {
		mImageWifi = findViewById(R.id.image_wifi);
		mImageWifi.getBackground().setLevel(2500);

		findViewById(R.id.button_wifi_normal).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageWifi.getBackground().setLevel(2500);
			}
		});

		findViewById(R.id.button_wifi_disable).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageWifi.getBackground().setLevel(7500);
			}
		});

		mImageVolume = findViewById(R.id.image_volume);
		mImageVolume.getBackground().setLevel(500);

		findViewById(R.id.button_volume_level_1).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(500);
			}
		});

		findViewById(R.id.button_volume_level_2).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(1500);
			}
		});

		findViewById(R.id.button_volume_level_3).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(2500);
			}
		});

		findViewById(R.id.button_volume_level_4).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(3500);
			}
		});

		findViewById(R.id.button_volume_level_5).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(4500);
			}
		});

		findViewById(R.id.button_volume_level_6).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(5500);
			}
		});

		findViewById(R.id.button_volume_level_7).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(6500);
			}
		});

		findViewById(R.id.button_volume_level_8).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageVolume.getBackground().setLevel(7500);
			}
		});
	}
}
