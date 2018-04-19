package com.tuacy.drawableresource.ClipDrawable;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.tuacy.drawableresource.R;

public class ClipDrawableActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, ClipDrawableActivity.class));
	}

	private ImageView mImageClip;
	private View      mViewProgress;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clip);
		initView();
	}

	private void initView() {
		mViewProgress = findViewById(R.id.view_progress);
		mImageClip = findViewById(R.id.image_clip);
		mImageClip.getBackground().setLevel(1000);

		findViewById(R.id.button_level_0).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mImageClip.getBackground().setLevel(0);
			}
		});

		findViewById(R.id.button_level_1000).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mImageClip.getBackground().setLevel(1000);
			}
		});

		findViewById(R.id.button_level_8000).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mImageClip.getBackground().setLevel(8000);
			}
		});

		findViewById(R.id.button_level_10000).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mImageClip.getBackground().setLevel(10000);
			}
		});

		findViewById(R.id.button_level_animation).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 10000);
				valueAnimator.setDuration(3000);
				valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					@Override
					public void onAnimationUpdate(ValueAnimator animation) {
						mImageClip.getBackground().setLevel((Integer) animation.getAnimatedValue());
					}
				});
				valueAnimator.start();
			}
		});

		ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 10000);
		valueAnimator.setDuration(6000);
		valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				mViewProgress.getBackground().setLevel((Integer) animation.getAnimatedValue());
			}
		});
		valueAnimator.setRepeatCount(-1);
		valueAnimator.start();
	}
}
