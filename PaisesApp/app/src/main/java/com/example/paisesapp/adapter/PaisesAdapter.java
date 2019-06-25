package com.example.paisesapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paisesapp.R;
import com.example.paisesapp.model.Pais;

import java.util.List;

public class PaisesAdapter extends RecyclerView.Adapter<PaisesAdapter.ViewHolder> {

    private List<Pais> listaPaises;

    public PaisesAdapter(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pais_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.setupPaises(listaPaises.get(i));
    }


    @Override
    public int getItemCount() {
        return listaPaises.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView bandeiraImageView;
        private TextView populacaoTextView;
        private TextView nomeTextView;
        private TextView idiomaTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bandeiraImageView = itemView.findViewById(R.id.bandeira_image_view_id);
            populacaoTextView = itemView.findViewById(R.id.populacao_text_view_id);
            nomeTextView = itemView.findViewById(R.id.nome_pais_text_view_id);
            idiomaTextView = itemView.findViewById(R.id.idoma_text_view_id);

        }

        public void setupPaises(Pais pais) {

        }
    }
}
