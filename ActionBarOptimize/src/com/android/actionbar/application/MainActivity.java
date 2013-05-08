package com.android.actionbar.application;

import com.android.actionbar.googlenative.NativeActionBarActivity;
import com.android.actionbaroptimize.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {
	private static final String TAG = "ActionBar";
	private TextView tvActionBarDesp = null;
	private Button btnNativeActionBar = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		tvActionBarDesp = (TextView) findViewById(R.id.tvActionBarCompare);
		tvActionBarDesp.setText(R.string.actionbar);

		btnNativeActionBar = (Button) findViewById(R.id.tvNativeActionBar);
		btnNativeActionBar.setText(R.string.NativeActionBar);
		btnNativeActionBar.setOnClickListener(new NativeActionBarListener());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 1, R.string.exit);
		menu.add(0, 2, 2, R.string.about);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 1) {
			finish();
		} else if (item.getItemId() == 2) {

		}

		return super.onOptionsItemSelected(item);
	}

	class NativeActionBarListener implements OnClickListener {

		@Override
		public void onClick(View v) {

			Intent intent = new Intent();
			intent.setClass(NativeActionBarActivity.this,
					NativeActionBarActivity.class);
			NativeActionBarActivity.this.startActivity(intent);
		}

	}

}
