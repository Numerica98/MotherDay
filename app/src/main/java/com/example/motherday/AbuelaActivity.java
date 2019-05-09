package com.example.motherday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AbuelaActivity extends AppCompatActivity {

    TextView tv_nombre, tv_mensaje;
    ImageView iv_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tv_nombre= findViewById(R.id.tv_nombre);
        tv_mensaje= findViewById(R.id.tv_mensaje);
        iv_foto= findViewById(R.id.iv_foto);

        tv_nombre.setText("ABUELA");
        iv_foto.setImageResource(R.drawable.abuela);
        tv_mensaje.setText("Eres una doble mamá que nos ha cuidado mucho todo estos años. Gracias por tu amor, las comiditas ricas que nos haces, el estar pendiente de nosotros y tenernos siempre en oraciones. Te amamos mucho");


    }

}
