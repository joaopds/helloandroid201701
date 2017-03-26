package br.edu.usj.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rafael on 08/03/17.
 */

public class MainActivity extends Activity {

    private EditText campoNome;
    //private TextView saudacaoTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        //este campo pega a informacao do campo texto
        this.campoNome = (EditText) findViewById(R.id.nomeEditText);
        //this.saudacaoTextView = (TextView) findViewById(
        //        R.id.saudacaoTextView);
    }

    public void surpreenderUsuario(View view) {
        Editable textoEditable = this.campoNome.getText();
        //Intent intent = new Intent(this, SaudacaoActivity.class);
        Intent intent = new Intent(Saudacao2Activity.ACAO_NOME);
        //intent.addCategory(Saudacao2Activity.CATEGORIA_NOME);
        intent.putExtra(Saudacao2Activity.EXTRA_NOME,
                textoEditable.toString());
        startActivity(intent);
        //this.saudacaoTextView.setText(textoEditable.toString());
    }
}
