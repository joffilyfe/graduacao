package pdm.joffily.me.feelings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioActivity extends AppCompatActivity {

    private Button formularioButtonSalvar;
    private EditText titulo;
    private EditText descricao;
    private EditText nota;
    private EditText observacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        this.formularioButtonSalvar = (Button) this.findViewById(R.id.formularioButtonSalvar);
        this.titulo = (EditText) this.findViewById(R.id.formularioTitulo);
        this.descricao = (EditText) this.findViewById(R.id.formularioDescricao);
        this.nota = (EditText) this.findViewById(R.id.formularioNota);
        this.observacao = (EditText) this.findViewById(R.id.formularioObservacao);


        this.formularioButtonSalvar.setOnClickListener(new OnClickSalvar());
    }

    private class OnClickSalvar implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            String titulo = FormularioActivity.this.titulo.getText().toString();
            String descricao = FormularioActivity.this.descricao.getText().toString();
            String nota = FormularioActivity.this.nota.getText().toString();
            String observacao = FormularioActivity.this.observacao.getText().toString();

            Registro r = new Registro(titulo, descricao, nota, observacao);
            Intent it = new Intent();
            it.putExtra("Registro", r);
            setResult(RESULT_OK, it);
            finish();
        }
    }
}
