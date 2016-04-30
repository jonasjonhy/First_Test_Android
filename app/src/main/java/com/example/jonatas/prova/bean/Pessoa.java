package com.example.jonatas.prova.bean;


import com.example.jonatas.provajosias.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonatas on 19/03/2016.
 */
public class Pessoa {

    private int imagem;
    private String nome;
    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static List<Pessoa> getTodas(){

        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        for (int i = 0; i < 33; i++){
            p.setImagem(R.drawable.foto);
            p.setNome("Jonatas Luis");
            p.setTelefone("986004852");
            pessoas.add(p);

            p2.setImagem(R.drawable.fotoo);
            p2.setNome("Keren Hapuque");
            p2.setTelefone("987766925");
            pessoas.add(p2);

            p3.setNome("André Luiz");
            p3.setImagem(R.drawable.fotooo);
            p3.setTelefone("987570954");
            pessoas.add(p3);
        }
        return pessoas;
    }
}
