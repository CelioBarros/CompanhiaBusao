package com.application.ciadobusao.db;

import com.application.ciadobusao.util.NotificationCustomUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter.LengthFilter;
import android.util.Log;
import android.widget.Toast;

public class GcmMessageHandler extends IntentService {

	String titulo, mes;
//	private Handler handler;

	public GcmMessageHandler() {
		super("GcmMessageHandler");
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
//		handler = new Handler();
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		Bundle extras = intent.getExtras();

		GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);

		String messageType = gcm.getMessageType(intent);

		titulo = extras.getString("title");
		mes = extras.getString("message");
		
		if (mes.equals("")){
			NotificationCustomUtil.novoEncontroNotificacao(GcmMessageHandler.this.getApplicationContext(), "Um novo encontro foi criado!", titulo);
		} else {
			char key = titulo.charAt(titulo.length()-1); 
			if (key == 'C'){
				titulo = titulo.substring(0, titulo.length()-1);
				NotificationCustomUtil.novoEncontroNotificacao(GcmMessageHandler.this.getApplicationContext(), "Novo participante no encontro " + mes, titulo + " confirmou presença no encontro " + mes);
			} else if (key == 'G'){
				titulo = titulo.substring(0, titulo.length()-1);
				NotificationCustomUtil.novoEncontroNotificacao(GcmMessageHandler.this.getApplicationContext(), "Alguém chegou! " + mes, titulo + " chegou no encontro " + mes);
			}
		}
		
		Log.i("GCM","Received : (" + messageType + ")  " + extras.getString("title"));

		GcmBroadcastReceiver.completeWakefulIntent(intent);

	}

}