package com.example.professoresapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.professoresapp.interfaces.ProfessorListener;
import com.example.professoresapp.adapter.ProfessorAdapter;
import com.example.professoresapp.model.Professor;
import com.example.professoresapp.model.ProfessorDetalheActivity;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProfessorListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Professor> listaProfessores = new ArrayList<>();
        Professor professor1 = new Professor();
        professor1.setNome("Fábio tadashi");
        professor1.setCurso("Mobile android");
        listaProfessores.add(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("Guilherme Sartori");
        professor2.setCurso("Full Stack");


        listaProfessores.add(professor2);
        listaProfessores.add(professor2);
        listaProfessores.add(professor2);
        listaProfessores.add(professor2);
        listaProfessores.add(professor2);
        listaProfessores.add(professor2);
        listaProfessores.add(professor2);
        listaProfessores.add(professor2);




        ProfessorAdapter professorAdapter = new ProfessorAdapter(listaProfessores,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_id);
        recyclerView.setAdapter(professorAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }

    @Override
    public void onProfessorClicado(Professor professor) {

        Intent intent = new Intent(this, ProfessorDetalheActivity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
