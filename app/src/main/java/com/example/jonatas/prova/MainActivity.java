package com.example.jonatas.prova;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jonatas.provajosias.R;


public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.login);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void realizarLogin(View view){

        if(login.getText().toString().isEmpty() || senha.getText().toString().isEmpty()){
            Snackbar.make(view, "Por favor informe seu login e senha", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();
        }else{
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }


    }
}
