package com.tuacy.drawableresource.TransitionDrawable;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuacy.drawableresource.R;

public class TransitionDrawableActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, TransitionDrawableActivity.class));
	}

	private View mViewState;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transition);
		initView();
	}

	private void initView() {
		mViewState = findViewById(R.id.view_state);
		TransitionDrawable drawable = (TransitionDrawable) mViewState.getBackground();
		drawable.startTransition(500);

		findViewById(R.id.button_state_1).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TransitionDrawable drawable = (TransitionDrawable) mViewState.getBackground();
				drawable.startTransition(500);
			}
		});

		findViewById(R.id.button_state_2).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TransitionDrawable drawable = (TransitionDrawable) mViewState.getBackground();
				drawable.reverseTransition(500);
			}
		});
	}
}
