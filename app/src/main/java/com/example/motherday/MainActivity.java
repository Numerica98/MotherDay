package com.example.motherday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btMama, btAbuela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMama= findViewById(R.id.bt_mama);
        btAbuela= findViewById(R.id.bt_abuela);

        btMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent= new Intent(MainActivity.this, MamaActivity.class);

                startActivity(m_intent);

            }
        });

        btAbuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent= new Intent(MainActivity.this, AbuelaActivity.class);

                startActivity(m_intent);

            }
        });
    }


}
