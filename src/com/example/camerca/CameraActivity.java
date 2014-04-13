package com.example.camerca;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class CameraActivity extends ActionBarActivity {
	Object mCamera;

	boolean safeCameraOpen(int id) {
		boolean qOpened = false;

		try {
			mCamera = Camera.open(id);
			qOpened = (mCamera != null);
		} catch (Exception e) {
			Log.e(getString(R.string.app_name), "failed to open Camera");
			e.printStackTrace();
		}

		return qOpened;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}
}
