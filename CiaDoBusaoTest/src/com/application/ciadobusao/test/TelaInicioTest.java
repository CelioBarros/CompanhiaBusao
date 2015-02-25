package com.application.ciadobusao.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.Button;

import com.application.ciadobusao.MainActivity;
import com.application.ciadobusao.R;

public class TelaInicioTest extends ActivityInstrumentationTestCase2<MainActivity>{

	private MainActivity mActivity;
	private Button mButton;

	public TelaInicioTest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		setActivityInitialTouchMode(false);

	    mActivity = getActivity();
	    
	    mButton =  (Button) mActivity.findViewById(R.id.buttonInicio);

	}

	public void test(){
		assertEquals(getActivity(), mButton.getContext());
		//assertEquals(1, mButton.getVisibility());
		
		final View decorView = mActivity.getWindow().getDecorView();
		
		ViewAsserts.assertOnScreen(decorView, mButton);
	}
	

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
