package com.tuacy.drawableresource.LayerDrawable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tuacy.drawableresource.R;

public class LayerDrawableActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, LayerDrawableActivity.class));
	}

	private TextView mTextTab1;
	private TextView mTextTab2;
	private TextView mTextTab3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layer_list);
		initView();
	}

	private void initView() {
		mTextTab1 = findViewById(R.id.text_tab_1);
		mTextTab2 = findViewById(R.id.text_tab_2);
		mTextTab3 = findViewById(R.id.text_tab_3);
		mTextTab1.setSelected(true);
		mTextTab2.setSelected(false);
		mTextTab3.setSelected(false);

		mTextTab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTextTab1.setSelected(true);
				mTextTab2.setSelected(false);
				mTextTab3.setSelected(false);
			}
		});

		mTextTab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTextTab1.setSelected(false);
				mTextTab2.setSelected(true);
				mTextTab3.setSelected(false);
			}
		});

		mTextTab3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTextTab1.setSelected(false);
				mTextTab2.setSelected(false);
				mTextTab3.setSelected(true);
			}
		});


	}
}
