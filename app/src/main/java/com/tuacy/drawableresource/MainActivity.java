package com.tuacy.drawableresource;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.drawableresource.InsetDrawable.InsetDrawableActivity;
import com.tuacy.drawableresource.LayerDrawable.LayerDrawableActivity;
import com.tuacy.drawableresource.LevelListDrawable.LevelListDrawableActivity;
import com.tuacy.drawableresource.TransitionDrawable.TransitionDrawableActivity;
import com.tuacy.drawableresource.ClipDrawable.ClipDrawableActivity;
import com.tuacy.drawableresource.ScaleDrawable.ScaleDrawableActivity;
import com.tuacy.drawableresource.GradientDrawable.GradientDrawableActivity;

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
				ClipDrawableActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_scale).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				ScaleDrawableActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_shape).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				GradientDrawableActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_inset).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				InsetDrawableActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_level_list).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				LevelListDrawableActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_layer_list).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				LayerDrawableActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_drawable_resource_transition).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				TransitionDrawableActivity.startUp(mContext);
			}
		});
	}
}
