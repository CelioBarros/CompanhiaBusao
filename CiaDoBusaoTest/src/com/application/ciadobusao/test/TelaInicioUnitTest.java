package com.application.ciadobusao.test;

import java.util.zip.Inflater;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.application.ciadobusao.MainActivity;
import com.application.ciadobusao.MainFragment;
import com.application.ciadobusao.R;

public class TelaInicioUnitTest extends ActivityUnitTestCase<MainActivity> {

	private MainActivity activity;
	private MainFragment fragment;
	private View view;
	private int buttonId;

	public TelaInicioUnitTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), MainFragment.class);
		startActivity(intent, null, null);
		//criar o fragment
		//view = LayoutInflater.inflate(R.layout.activity_main, (ViewGroup) getActivity()., false);
		activity = getActivity();
		//colocar o fragment pra frente
		fragment.getActivity().getApplicationContext();
	}
	
	@SmallTest
	public void testPreConditions(){
		assertNotNull(fragment);
	}
	
	@SmallTest
	public void testLayoutButtonInicio() {
	    buttonId = com.application.ciadobusao.R.id.buttonInicio;
	    assertNotNull(view.findViewById(buttonId));
	    Button view2 = (Button) view.findViewById(buttonId);
	    assertEquals("Incorrect label of the button", "Inicio", view2.getText());
	}

	@SmallTest
	public void testLayoutButtonLoginFacebook() {
	    buttonId = com.application.ciadobusao.R.id.authButton;
	    assertNotNull(activity.findViewById(buttonId));
	    Button view2 = (Button) view.findViewById(buttonId);
	    assertEquals("Incorrect label of the button", "Log in with Facebook", view2.getText());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
