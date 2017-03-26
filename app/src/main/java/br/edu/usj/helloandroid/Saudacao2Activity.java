package br.edu.usj.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by rafael on 22/03/17.
 */

public class Saudacao2Activity extends Activity {
    private TextView saudacaoTextView;
    public static final String ACAO_NOME
            = "helloandroid.saudacao2.acao_nome";
    public static final String CATEGORIA_NOME =
            "helloandroid.saudacao2.categoria_nome";
    public static final String EXTRA_NOME =
            "helloandroid.saudacao2.extra_nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_saudacao);
        this.saudacaoTextView = (TextView) findViewById(
                R.id.saudacaoTextView);

        Intent intent = getIntent();

        if(intent.hasExtra(EXTRA_NOME)){
            String nome = intent.getStringExtra(EXTRA_NOME);
            this.saudacaoTextView.setText(nome);
        }
        else{
            this.saudacaoTextView.setText(R.string.sem_informacao);
        }

    }
}
