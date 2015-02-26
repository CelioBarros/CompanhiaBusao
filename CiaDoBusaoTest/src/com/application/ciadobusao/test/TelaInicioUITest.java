package com.application.ciadobusao.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import com.application.ciadobusao.MainActivity;
import com.application.ciadobusao.R;

public class TelaInicioUITest extends ActivityInstrumentationTestCase2<MainActivity>{

	private MainActivity activity;
	private Button button;

	public TelaInicioUITest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		setActivityInitialTouchMode(true);

	    activity = getActivity();
	    
	    button =  (Button) activity.findViewById(R.id.buttonInicio);

	}
	
	@SmallTest
	public void testPreConditions(){
		assertNotNull(activity);
		assertNotNull(activity.findViewById(R.id.buttonInicio));
		assertNotNull(activity.findViewById(R.id.authButton));
	}

	@SmallTest
	public void testButtonInicio(){
		//testa se a activity eh a atual
		assertEquals(getActivity(), button.getContext());
		//testa se o texto do botao buttonInicio esta correto
		Button view = (Button) activity.findViewById(R.id.buttonInicio);
		assertEquals("Incorrect label of the button", "Inicio", view.getText());
		//testa se o botao "Inicio" esta visivel 
		assertEquals(0, button.getVisibility());

		final View decorView = activity.getWindow().getDecorView();
		
		ViewAsserts.assertOnScreen(decorView, button);
		
		final ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
		assertNotNull(layoutParams);	    
//		assertEquals(layoutParams.width, WindowManager.LayoutParams.MATCH_PARENT);
		assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
	}
	
	@MediumTest
	public void testInfoTextView_layout() {
	    final View decorView = activity.getWindow().getDecorView();
//	    ViewAsserts.assertOnScreen(decorView, mInfoTextView);
//	    assertTrue(View.GONE == mInfoTextView.getVisibility());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
