package com.example.app_studio_copa_do_mundo_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Selecao[] selecoes;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selecoes = new Selecao[4];
        Selecao brasil = new Selecao("Brasil", "4 - 2 - 3 - 1", null);
        Selecao servia = new Selecao("Sérvia", "2 - 3 - 4 - 1", null);
        Selecao suica = new Selecao("Suiça", "1 - 2 - 3 - 4", null);
        Selecao camaroes = new Selecao("Camarões", "2 - 2 - 2 - 4", null);

        selecoes[0] = brasil;
        selecoes[1] = servia;
        selecoes[2] = suica;
        selecoes[3] = camaroes;
    }

    public void AbrirTelaDeSelecoes(View view){

        i = new Intent(MainActivity.this, Tela2Activity.class);

        if(view.equals(findViewById(R.id.brasilImageButton)))
            adicionarParametrosDoIntent(selecoes[0]);
        else if(view.equals(findViewById(R.id.serviaImageButton)))
            adicionarParametrosDoIntent(selecoes[1]);
        else if(view.equals(findViewById(R.id.suicaImageButton)))
            adicionarParametrosDoIntent(selecoes[2]);
        else
            adicionarParametrosDoIntent(selecoes[3]);

        startActivity(i);
    }

    public void adicionarParametrosDoIntent(Selecao selecao){
        i.putExtra("NOME_PAIS", selecao.getPais());
        i.putExtra("NOME_FORMACAO", selecao.getFormacao());
    }
}