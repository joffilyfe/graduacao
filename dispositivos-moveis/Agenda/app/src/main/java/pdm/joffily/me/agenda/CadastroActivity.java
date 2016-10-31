package pdm.joffily.me.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

import model.Pessoa;

public class CadastroActivity extends AppCompatActivity {

    private Button btnSalvarCadastro;
    private Pessoa contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        this.btnSalvarCadastro = (Button) this.findViewById(R.id.btnSalvarCadastro);

        this.btnSalvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Buscar textos na Activity e popular o objeto Pessoa
                contato = new Pessoa("joffily", "contato@joffily.me", 99999989);
                Intent it = new Intent();
                it.putExtra("contato", contato);
                setResult(RESULT_OK, it);
                finish();
            }
        });
    }
}
