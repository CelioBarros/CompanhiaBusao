package com.application.ciadobusao.telas;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.application.ciadobusao.R;
import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;


public class NovoEncontroFragment extends Fragment{
	private Button dataButton;
	private Button criarEncontroButton;
	private Button horaButton;
	private DataDoEncontro data;
	private HorarioDoEncontro horario;
	private Encontro encontro; 
	private View rootView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_novo_encontro, container, false);

		dataButton= (Button) rootView.findViewById(R.id.dataPickerButton);
		dataButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DialogFragment newFragment = new DatePickerFragment();
				newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");;
			}
		});
		
		horaButton= (Button) rootView.findViewById(R.id.horarioButton);
		horaButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DialogFragment newFragment = new TimePickerFragment();
			    newFragment.show(getActivity().getSupportFragmentManager(), "timePicker");
			   
			}
		});
		
		
		criarEncontroButton= (Button) rootView.findViewById(R.id.botaocriar);
		criarEncontroButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				encontro = new Encontro(
						((TextView) rootView.findViewById(R.id.nomeEdit)).getText().toString(),
						((TextView) rootView.findViewById(R.id.pontoEdit)).getText().toString(),
						((TextView) rootView.findViewById(R.id.linhaEdit)).getText().toString(),
						horario, 
						data);
				
				FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new HomeFragment()).commit();
				Toast.makeText(getActivity(), "Encontro Criado",Toast.LENGTH_LONG).show();
			   
			}
		});
		return rootView;
	}	







	//=======================DATA PICKER =====================
	public class DatePickerFragment extends DialogFragment
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
			data = new DataDoEncontro(day, month, year);
		}


	};
	//====================CLOCK PICKER=========================================
	public class TimePickerFragment extends DialogFragment
	implements TimePickerDialog.OnTimeSetListener {

		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			// Use the current time as the default values for the picker
			final Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);

			// Create a new instance of TimePickerDialog and return it
			return new TimePickerDialog(getActivity(), this, hour, minute,
					DateFormat.is24HourFormat(getActivity()));
		}

		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
			horario = new HorarioDoEncontro(hourOfDay, minute);
		}
	};
}



