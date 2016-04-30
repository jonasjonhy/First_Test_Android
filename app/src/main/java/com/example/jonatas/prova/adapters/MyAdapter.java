package com.example.jonatas.prova.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonatas.prova.bean.Pessoa;
import com.example.jonatas.prova.interfaces.RecyclerViewOnClickListenerHack;
import com.example.jonatas.provajosias.R;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Pessoa> pessoas;
    private RecyclerViewOnClickListenerHack mRecyclerViewOnClickListenerHack;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private static final String TAG = "";
        private ImageView imagem;
        private TextView nome;
        private ImageButton telefone;

        public ViewHolder(View v) {
            super(v);
            imagem = (ImageView)v.findViewById(R.id.ivImagem);
            nome = (TextView)v.findViewById(R.id.tvNome);
            telefone = (ImageButton) v.findViewById(R.id.telefone);

            telefone.setOnClickListener(this);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"clicou na lista"+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public void onClick(View v) {
            if(mRecyclerViewOnClickListenerHack != null){
                mRecyclerViewOnClickListenerHack.onClick(v, getLayoutPosition());
            }
        }
    }



    public MyAdapter(List<Pessoa> myDataset, Context context){
            pessoas = myDataset;
            this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.imagem.setImageResource(pessoas.get(position).getImagem());
        holder.nome.setText(pessoas.get(position).getNome());

    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }

    public void setRecyclerViewOnClickListenerHack(RecyclerViewOnClickListenerHack r){
        mRecyclerViewOnClickListenerHack = r;
    }

    public Pessoa getItemPosicao(int position){
        return pessoas.get(position);
    }
}