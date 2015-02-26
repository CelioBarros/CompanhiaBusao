package com.application.ciadobusao.test;

import com.application.ciadobusao.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

public class TelaInicioFunctionalTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;

	public TelaInicioFunctionalTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		activity = getActivity();
	}

	@SmallTest
	public void testStartOtherActivity() throws Exception {
		// Assertions in here
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
