package com.example.paisesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.paisesapp.adapter.PaisesAdapter;
import com.example.paisesapp.model.Pais;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Pais> listaPaises = new ArrayList<>();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setIdioma("Portugues");
        pais.setQuantidadeDeHabitantes(200000000);
        listaPaises.add(pais);

        Pais pais1 = new Pais();
        pais.setNome("China");
        pais.setIdioma("Mandarim");
        pais.setQuantidadeDeHabitantes(1000000000);
        listaPaises.add(pais);

        Pais pais2 = new Pais();
        pais.setNome("Estados Unidos");
        pais.setIdioma("Ingles");
        pais.setQuantidadeDeHabitantes(300000000);
        listaPaises.add(pais);
        listaPaises.add(pais);
        listaPaises.add(pais);
        listaPaises.add(pais);
        listaPaises.add(pais);
        listaPaises.add(pais);
        listaPaises.add(pais);



        PaisesAdapter paisesAdapter = new PaisesAdapter(listaPaises);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_id);
        recyclerView.setAdapter(paisesAdapter);
        recyclerView.setLayoutManager(layoutManager);



    }
}
