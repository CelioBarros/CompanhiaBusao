package com.application.ciadobusao.telas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.telas.MeusEncontrosFragment.MeuAsyncTask;
import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;

public class NovoEncontroFragment extends Fragment {
	private Button dataButton;
	private Button criarEncontroButton;
	private Button horaButton;
	private Button cancelarButton;
	private Button localButton;
	private DataDoEncontro data;
	private HorarioDoEncontro horario;
	private Encontro encontro;

	private View rootView;
	private TextView nomeEncontroTextView;
	private TextView linhaEncontroTextView;
	private TextView pontoEncontroTextView;
	private TextView localEncontroTextView;
	private TextView horaTextView, dataTextView;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	String dataAtual = new String();
	public static boolean novoEncontro = false;

	private static String nomeEncontro = "";
	private static String pontoEncontro = "";
	private static String linhaEncontro = "";
	public static String localEncontro = "";
	public static double latitudeEncontro, longitudeEncontro = 0;
	private int count;
	private boolean cria = false;

	@Override
	public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
			final Bundle savedInstanceState) {
		novoEncontro = false;
		dataAtual = dateFormat.format(date);
		final String[] dataAtu = dataAtual.split("/");
		rootView = inflater.inflate(R.layout.fragment_novo_encontro, container,
				false);

		nomeEncontroTextView = (TextView) rootView.findViewById(R.id.nomeEdit);
		horaTextView = (TextView) rootView.findViewById(R.id.textViewHora);
		dataTextView = (TextView) rootView.findViewById(R.id.textViewData);
		localEncontroTextView = (TextView) rootView.findViewById(R.id.textViewLocal);

		linhaEncontroTextView = (TextView) rootView
				.findViewById(R.id.linhaEdit);
		pontoEncontroTextView = (TextView) rootView
				.findViewById(R.id.pontoEdit);

		nomeEncontroTextView.setText(nomeEncontro);
		linhaEncontroTextView.setText(linhaEncontro);
		pontoEncontroTextView.setText(pontoEncontro);
		localEncontroTextView.setText(localEncontro);

		localButton = (Button) rootView.findViewById(R.id.buttonLocal);

		//Acao Botao Local
		localButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				latitudeEncontro = 0; longitudeEncontro = 0;
				nomeEncontro = ((TextView) rootView
						.findViewById(R.id.nomeEdit)).getText().toString();
				pontoEncontro = ((TextView) rootView
						.findViewById(R.id.pontoEdit)).getText().toString();
				linhaEncontro = ((TextView) rootView
						.findViewById(R.id.linhaEdit)).getText().toString();
				novoEncontro = true;
				MapFragment mapFragment = new MapFragment();
				FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
				fragmentManager.beginTransaction().replace(R.id.container, mapFragment).commit();
			}
		});


		dataButton = (Button) rootView.findViewById(R.id.dataPickerButton);
		dataButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DialogFragment newFragment = new DatePickerFragment();
				newFragment.show(getActivity().getSupportFragmentManager(),
						"datePicker");
				;
			}
		});

		horaButton = (Button) rootView.findViewById(R.id.horarioButton);
		horaButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DialogFragment newFragment = new TimePickerFragment();
				newFragment.show(getActivity().getSupportFragmentManager(),
						"timePicker");

			}
		});

		cancelarButton = (Button) rootView.findViewById(R.id.cancelarButtonId);
		cancelarButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				novoEncontro = false;
				nomeEncontro = "";
				linhaEncontro = "";
				pontoEncontro = "";
				localEncontro = "";
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				fragmentManager.beginTransaction()
				.replace(R.id.container, new PerfilFragment()).commit();

			}
		});

		criarEncontroButton = (Button) rootView.findViewById(R.id.botaocriar);
		criarEncontroButton.setOnClickListener(new View.OnClickListener() {
			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {

				nomeEncontro = ((TextView) rootView
						.findViewById(R.id.nomeEdit)).getText().toString();



				pontoEncontro = ((TextView) rootView
						.findViewById(R.id.pontoEdit)).getText().toString();


				linhaEncontro = ((TextView) rootView
						.findViewById(R.id.linhaEdit)).getText().toString();


				count = 0;
				if (!isNomeEncontroValid(nomeEncontro)) {
					nomeEncontroTextView.setError("Nome Invalido");
					count = count + 1;
				}
				if (!isPontoEcontroValid(pontoEncontro)) {
					pontoEncontroTextView.setError("Ponto Invalido");
					count = count + 1;
				}
				if (!isLinhaEncontroValid(linhaEncontro)) {
					linhaEncontroTextView.setError("Linha Invalida");
					count = count + 1;
				}
				if (horario == null) {
					count = count + 1;
					Toast.makeText(getActivity(), "Horario Invalido",
							Toast.LENGTH_LONG).show();
				}
				if ((data == null)
						|| (data.getAno() < Integer.parseInt(dataAtu[2]))
						|| (data.getAno() == Integer.parseInt(dataAtu[2]) && data
						.getMes() < (Integer.parseInt(dataAtu[1])))
						|| (data.getAno() == Integer.parseInt(dataAtu[2])
						&& data.getMes() == (Integer
								.parseInt(dataAtu[1])) && data.getDia() < (Integer
										.parseInt(dataAtu[0])))) {
					count = count + 1;
					Toast.makeText(getActivity(), "Data Invalida",
							Toast.LENGTH_LONG).show();
				}
				//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
				if(data == null || horario == null){



				}else{
					AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
					.create(); // Read Update
					alertDialog.setTitle("Criar Encontro");

					alertDialog.setMessage("Nome:" + nomeEncontro + "\n"
							+ "Ponto de Referencia:" + pontoEncontro + "\n"
							+ "Linha: " + linhaEncontro + "\n" + "Data: "
							+ data.toString() + "\n" + "Horario: "
							+ horario.toString() + "\n");

					alertDialog.setButton("OK",
							new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int which) {
							if (count == 0) {
								Log.v("mapa", "qnty = " + getFragmentManager().getBackStackEntryCount());
								encontro = new Encontro();

								encontro.setNome(nomeEncontro);
								encontro.setPonto(pontoEncontro);
								encontro.setLinha(linhaEncontro);
								encontro.setHorario(horario);
								encontro.setData(data);
								encontro.setIdDono(PerfilFragment.getUser()
										.getId());
								encontro.setNomeDono(PerfilFragment
										.getUser().getName());
								encontro.setLatitude(latitudeEncontro);
								encontro.setLongitude(longitudeEncontro);

								ClienteRest cliREST = new ClienteRest();
								try {

									String resposta = cliREST
											.inserirEncontro(encontro);
									Log.d("Aqui" + resposta, encontro
											.getPerfisConfirmados()
											.toString());
								} catch (Exception e) {
									e.getMessage();
									gerarToast(e.getMessage());
								}
								novoEncontro = false;
								nomeEncontro = "";
								linhaEncontro = "";
								pontoEncontro = "";
								localEncontro = "";
								getActivity().getActionBar().setTitle(R.string.title_section3);
								FragmentManager fragmentManager = getActivity()
										.getSupportFragmentManager();
								fragmentManager
								.beginTransaction()
								.replace(R.id.container,
										new MeusEncontrosFragment())
										.commit();
								gerarToast("Encontro Criado!");
							}
						}
					});

					alertDialog.setButton2("Editar",
							new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int which) {
						}
					});
					alertDialog.show();
				}
			}
		});
		return rootView;
	}

	@Override
	public void onResume() {
		novoEncontro = false;
		super.onResume();
	}

	private void gerarToast(CharSequence message) {
		int duration = Toast.LENGTH_LONG;
		Toast toast = Toast.makeText(getActivity().getApplicationContext(),
				message, duration);
		toast.show();
	}

	private boolean isPontoEcontroValid(String ponto) {
		if (ponto.length() > 2 && ponto != null) {
			return true;
		}
		return false;
	}

	private boolean isLinhaEncontroValid(String linha) {
		if (linha.length() > 2 && linha != null) {
			return true;
		}
		return false;
	}

	private boolean isNomeEncontroValid(String nomeEncontro) {
		if (nomeEncontro.length() > 3 && nomeEncontro != null) {
			return true;
		}
		return false;
	}

	// =======================DATA PICKER =====================
	public class DatePickerFragment extends DialogFragment implements
	DatePickerDialog.OnDateSetListener {

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

		@Override
		public void onDateSet(DatePicker view, int year, int month, int day) {

			data = new DataDoEncontro(day, month, year);
			dataTextView.setText(data.toString());

		}

	};

	// ====================CLOCK PICKER=========================================
	public class TimePickerFragment extends DialogFragment implements
	TimePickerDialog.OnTimeSetListener {

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

		@Override
		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
			horario = new HorarioDoEncontro(hourOfDay, minute);
			horaTextView.setText(horario.toString());
		}
	};
}
