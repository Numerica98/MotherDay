package com.example.motherday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MamaActivity extends AppCompatActivity {

    TextView tv_nombre, tv_mensaje;
    ImageView iv_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tv_nombre= findViewById(R.id.tv_nombre);
        tv_mensaje= findViewById(R.id.tv_mensaje);
        iv_foto= findViewById(R.id.iv_foto);

        tv_mensaje.setText("MAMI");
        iv_foto.setImageResource(R.drawable.mama);
        tv_mensaje.setText("Eres la mejor madre del mundo mundial, no olvides que te amamos, gracias por todo tu esfuerzo y ser una luz para nosotros. Diosito no se equivoco al darnos una mandre como tú");


    }
}
