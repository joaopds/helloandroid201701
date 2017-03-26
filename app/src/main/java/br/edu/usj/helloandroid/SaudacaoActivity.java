package br.edu.usj.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by rafael on 22/03/17.
 */

public class SaudacaoActivity extends Activity {

    private TextView saudacaoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_saudacao);
        this.saudacaoTextView = (TextView) findViewById(
                R.id.saudacaoTextView);

        Intent intent = getIntent();

        if(intent.hasExtra("nome")){
            String nome = intent.getStringExtra("nome");
            this.saudacaoTextView.setText(nome);
        }
        else{
            this.saudacaoTextView.setText("Sem informação");
        }


    }
}
