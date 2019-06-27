package com.example.professoresapp.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.professoresapp.R;

public class ProfessorDetalheActivity extends AppCompatActivity {

    private TextView nomeProfessorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_detalhe);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Professor professor = (Professor) bundle.getSerializable("PROFESSOR");

        nomeProfessorTextView = findViewById(R.id.nome_professor_text_view_id);

        nomeProfessorTextView.setText(professor.getNome());

    }
}
