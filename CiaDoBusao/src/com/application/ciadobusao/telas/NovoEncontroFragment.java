package com.application.ciadobusao.telas;

import java.util.Calendar;

import com.application.ciadobusao.R;
import com.application.ciadobusao.R.layout;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

public class NovoEncontroFragment extends Fragment{
	private Button dataButton;
	private Button criarEncontroButton;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_novo_encontro, container, false);
		
		dataButton= (Button) rootView.findViewById(R.id.dataPickerButton);
		dataButton.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	 DialogFragment newFragment = new DatePickerFragment();
		    	  newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");;
		    }
		});
		
		

		return rootView;
	}	

	
	
	
	
	
	
//=======================DATA PICKER =====================
	public static class DatePickerFragment extends DialogFragment
	implements DatePickerDialog.OnDateSetListener {

		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			// Use the current date as the default date in the picker
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);

			// Create a new instance of DatePickerDialog and return it
			return new DatePickerDialog(getActivity(), this, year, month, day);
		}

		public void onDateSet(DatePicker view, int year, int month, int day) {
			// Do something with the date chosen by the user
		}
		
		
	};

}



