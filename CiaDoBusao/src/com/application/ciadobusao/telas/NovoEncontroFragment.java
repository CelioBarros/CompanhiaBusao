package com.application.ciadobusao.telas;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;


public class NovoEncontroFragment extends Fragment{
	private Button dataButton;
	private Button criarEncontroButton;
	private Button horaButton;
	private Button cancelarButton;
	private DataDoEncontro data;
	private HorarioDoEncontro horario;
	private Encontro encontro; 
	private SingletonDB meusEncontros = SingletonDB.getInstance();
	
	private View rootView;
	private TextView nomeEncontroTextView;
	private TextView linhaEncontroTextView;
	private TextView pontoEncontroTextView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_novo_encontro, container, false);

		nomeEncontroTextView = (TextView) rootView.findViewById(R.id.nomeEdit);
		linhaEncontroTextView = (TextView) rootView.findViewById(R.id.linhaEdit);
		pontoEncontroTextView = (TextView) rootView.findViewById(R.id.pontoEdit);
		
		
		
	
		
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
		
		cancelarButton = (Button) rootView.findViewById(R.id.cancelarButtonId);
		cancelarButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new HomeFragment()).commit();
				
			}
		});
		
		criarEncontroButton= (Button) rootView.findViewById(R.id.botaocriar);
		criarEncontroButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String nomeEncontro = ((TextView) rootView.findViewById(R.id.nomeEdit)).getText().toString();
				String pontoEncontro = ((TextView) rootView.findViewById(R.id.pontoEdit)).getText().toString();
				String linhaEncontro = ((TextView) rootView.findViewById(R.id.linhaEdit)).getText().toString();
				int count = 0;
				if(!isNomeEncontroValid(nomeEncontro)){
						nomeEncontroTextView.setError("Nome Invalido");
						count = count +1;
				}
				if(!isPontoEcontroValid(pontoEncontro)){
					pontoEncontroTextView.setError("Ponto Invalido");
					count = count +1;
				}
				if(!isLinhaEncontroValid(linhaEncontro)){
					linhaEncontroTextView.setError("Linha Invalida");
					count = count +1;
				}
				if(horario==null){
					count = count +1;
					Toast.makeText(getActivity(), "Horario Invalido",Toast.LENGTH_LONG).show();
				}
				if(data == null){
					count = count +1;
					Toast.makeText(getActivity(), "Data Invalida",Toast.LENGTH_LONG).show();
				}
				
				if(count==0){
				
					encontro = new Encontro(
							nomeEncontro,
							pontoEncontro,
							linhaEncontro,
							horario, 
							data);
					meusEncontros.addEncontro(encontro);
					FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
					fragmentManager.beginTransaction()
							.replace(R.id.container, new HomeFragment()).commit();
					Toast.makeText(getActivity(), "Encontro Criado",Toast.LENGTH_LONG).show();
				
				
				}
			   
			}
		});
		return rootView;
	}	
	
	private boolean isPontoEcontroValid(String ponto){
		if(ponto.length()>2  && ponto != null){
			return true;
		}
		return false;
	}
	
	private boolean isLinhaEncontroValid(String linha){
		if(linha.length()>2 && linha != null){
			return true;
		}
		return false;
	}
	private boolean isNomeEncontroValid(String nomeEncontro){
		if(nomeEncontro.length()>3 && nomeEncontro != null){
			return true;
		}
		return false;
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



