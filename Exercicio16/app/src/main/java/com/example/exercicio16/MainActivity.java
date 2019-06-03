package com.example.exercicio16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoApertado (View view) {

            Toast.makeText(this,"A cor Azul é a cor favorita de 45% das pessoas do mundo, possui 111 tons diferentes nomeados, além de ser associada a calma, simpatia, harmonia e fidelidade.",Toast.LENGTH_LONG).show();
        }

}
