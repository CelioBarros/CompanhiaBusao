//package com.application.ciadobusao.util;
//
//import java.util.ArrayList;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.application.ciadobusao.R;
//
//public class NotificacoesAdapter extends ArrayAdapter {
//  private final Context context;
//  private final ArrayList<Encontro> values;
//
//  public NotificacoesAdapter(Context context, int lista, ArrayList<Encontro> notificacoes) {
//    super(context, R.layout.layout_notificacoes, notificacoes);
//    this.context = context;
//    this.values = notificacoes;
//  }
//
//  @Override
//  public View getView(int position, View convertView, ViewGroup parent) {
//    LayoutInflater inflater = (LayoutInflater) context
//        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    View rowView = inflater.inflate(R.layout.layout_notificacoes, parent, false);
//    TextView textView = (TextView) rowView.findViewById(R.id.label);
//    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//    textView.setText(String.valueOf(values.get(position)));
//    // Change the icon for Windows and iPhone
//    String s = String.valueOf(values.get(position));
//    if (s.startsWith("Windows7") || s.startsWith("iPhone")
//        || s.startsWith("Solaris")) {
//      imageView.setImageResource(R.drawable.no);
//    } else {
//      imageView.setImageResource(R.drawable.ok);
//    }
//
//    return rowView;
//  }
//} 