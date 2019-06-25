package com.example.alunorecyclerapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alunorecyclerapp.R;
import com.example.alunorecyclerapp.model.Aluno;

import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder>{

    public AlunoAdapter(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    private List<Aluno> listaAlunos;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aluno_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.setupAlunos(listaAlunos.get(i));

    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView fotoImageView;
        private TextView nomeTextView;
        private TextView grupoTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoImageView = itemView.findViewById(R.id.imageView);
            nomeTextView = itemView.findViewById(R.id.nome_aluno_text_view);
            grupoTextView = itemView.findViewById(R.id.grupo_text_view);

        }

        public void setupAlunos(Aluno aluno) {

        }
    }

}




