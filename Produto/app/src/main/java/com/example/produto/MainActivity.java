package com.example.produto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoApertado(View view) {

        EditText precoProduto = findViewById(R.id.precoDoProduto);

        EditText porcentagem = findViewById(R.id.porcentagemProduto);

        Float preco = Float.parseFloat(precoProduto.getText().toString());
        Float porcentagemDesconto = Float.parseFloat(porcentagem.getText().toString());
        Float valorTotal = preco*(100-porcentagemDesconto) / 100;
        TextView precoComDesconto = findViewById(R.id.precoComDesconto);
        precoComDesconto.setText("Valor com Desconto R$ " + valorTotal);

        Log.i(MainActivity.class.toString(), "Calculando");

        Toast.makeText(this, "O valor é R$ "+valorTotal ,Toast.LENGTH_LONG).show();


    }


}
