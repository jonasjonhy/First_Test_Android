package com.example.jonatas.prova;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jonatas.provajosias.R;

public class ConfiguracoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);
    }


    public void voltarAoDrawer(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        finish();
        startActivity(intent);
    }

    /*sobrescrevi esse método para que quando o usuário voltar ele não volte pra ela de login, porque na tela anterior
    eu encerrei a activity porque caso eu não tivesse encerrado ela teria ficado duas vezes na pilha.*/
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Main2Activity.class);
        finish();
        startActivity(intent);
    }
}
