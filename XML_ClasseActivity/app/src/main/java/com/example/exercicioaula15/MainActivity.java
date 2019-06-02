package com.example.exercicioaula15;

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

        public void botaoApertado (View view) {

            EditText respostaNome = findViewById(R.id.texto_resposta_nome_id);

            EditText respostaEmail = findViewById(R.id.texto_resposta_email_id);

            EditText respostaEndereco = findViewById(R.id.texto_resposta_endereco_id);

            EditText respostaProfissao = findViewById(R.id.texto_resposta_profissao_id);

            if (respostaNome.getText().length() == 0) {
                Toast.makeText(this,"Preencha o campo Nome",Toast.LENGTH_SHORT).show();
            } else if (respostaEmail.getText().length() == 0) {
                Toast.makeText(this,"Preencha o campo Email",Toast.LENGTH_SHORT).show();
            }else if (respostaEndereco.getText().length() == 0) {
                Toast.makeText(this,"Preencha o campo Endereço",Toast.LENGTH_SHORT).show();
            }else if (respostaProfissao.getText().length() == 0) {
                Toast.makeText(this,"Preencha o campo Profissão",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,"Dados OK",Toast.LENGTH_SHORT).show();
            }


    }
}
