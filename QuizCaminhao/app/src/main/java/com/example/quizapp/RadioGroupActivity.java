package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

public class RadioGroupActivity extends AppCompatActivity {

    private RadioButton tipoDeCaminhao;
    private Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        Bundle bundle = getIntent().getExtras();

        quiz = (Quiz)bundle.getSerializable("QUIZ");

        Button buttonRadioGroup = findViewById(R.id.button_radio_id);
        buttonRadioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irParaCheckBox();
            }
        });

    }

    private void irParaCheckBox() {

        Intent intent = new Intent(this , CheckBoxActivity.class);
        Bundle bundle = new Bundle();

        RadioButton rbCarreto = findViewById(R.id.carreta_id);
        RadioButton rbsegonha = findViewById(R.id.segonha_id);
        RadioButton rbvuc = findViewById(R.id.vuc_id);
        RadioButton rbrefrigerado = findViewById(R.id.refrigerado_id);

        if(rbCarreto.isChecked()){
            quiz.setCaminhao("Carreto");
        }else if (rbsegonha.isChecked()){
            quiz.setCaminhao("Segonha");
        } else if (rbvuc.isChecked()){
            quiz.setCaminhao("VUC");
        } else if (rbrefrigerado.isChecked()){
            quiz.setCaminhao("Refrigerado");
        }

        bundle.putSerializable("QUIZ", quiz);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
