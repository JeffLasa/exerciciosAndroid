package com.example.alunorecyclerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.alunorecyclerapp.Adapter.AlunoAdapter;
import com.example.alunorecyclerapp.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Aluno> listaAlunos = new ArrayList<>();
        Aluno aluno = new Aluno("Jefferson", "Lyrio");
        listaAlunos.add(aluno);
        Aluno aluno2 = new Aluno("Luciano", "Lyrio");
        listaAlunos.add(aluno2);
        Aluno aluno3 = new Aluno("Paulo", "Pokemon");
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);

        AlunoAdapter alunosAdapter = new AlunoAdapter(listaAlunos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_id);
        recyclerView.setAdapter(alunosAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}
