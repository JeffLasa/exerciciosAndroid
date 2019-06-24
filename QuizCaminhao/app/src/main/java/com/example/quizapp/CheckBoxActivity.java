package com.example.quizapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class CheckBoxActivity extends AppCompatActivity {

    private Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        Bundle bundle = getIntent().getExtras();
        quiz = (Quiz)bundle.getSerializable("QUIZ");

        Button buttonFinalizar = findViewById(R.id.button_check_id);
        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibirFragment();

            }
        });

    }

    private void exibirFragment() {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id, new ResultadoFragments());
        transaction.commit();
    }


}
