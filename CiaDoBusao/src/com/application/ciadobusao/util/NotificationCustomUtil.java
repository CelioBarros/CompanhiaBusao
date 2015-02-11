package com.application.ciadobusao.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import com.application.ciadobusao.MainActivity;
import com.application.ciadobusao.R;

public class NotificationCustomUtil {

	private static NotificationManager mNotificationManager;

	public static void novoEncontroNotificacao(Context context, String title, String message) {

		mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 0);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context)
	        .setSmallIcon(R.drawable.ic_launcher)
	        .setContentTitle(title)
			.setContentText(message);

        mBuilder.setContentIntent(contentIntent);
        Notification notification = mBuilder.build();
		notification.flags |= Notification.FLAG_AUTO_CANCEL;
		int mId = 001;
		mNotificationManager.notify(mId, notification);
    }
}