package com.example.professoresapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.professoresapp.R;
import com.example.professoresapp.interfaces.ProfessorListener;
import com.example.professoresapp.model.Professor;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfessorAdapter extends RecyclerView.Adapter<ProfessorAdapter.ViewHolder> {

    private List<Professor> listaProfessores;
    private ProfessorListener professorListener;

    public ProfessorAdapter(List<Professor> listaProfessores, ProfessorListener professorListener) {
        this.listaProfessores = listaProfessores;
        this.professorListener = professorListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.professor_celula, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Professor professor = listaProfessores.get(i);
        viewHolder.setupProfessores(professor);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                professorListener.onProfessorClicado(professor);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaProfessores.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

     private TextView nomeProfessorTextView;
     private TextView cursoTextView;
     private CircleImageView imagemCircleImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeProfessorTextView= itemView.findViewById(R.id.nome_professor);
            cursoTextView= itemView.findViewById(R.id.curso_text_view_id);
            imagemCircleImageView= itemView.findViewById(R.id.imagem_circleImageView);

        }

        public void setupProfessores (Professor professor){
            nomeProfessorTextView.setText(professor.getNome());
            cursoTextView.setText(professor.getCurso());

        }
    }
}