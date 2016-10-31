package pdm.joffily.me.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import model.Pessoa;

public class MainActivity extends AppCompatActivity {

    private Button btnAddMain;
    private TextView tvContactNameMain;
    private static final int AGENDA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnAddMain = (Button) this.findViewById(R.id.btnAddMain);
        this.tvContactNameMain = (TextView) this.findViewById(R.id.tvContactNameMain);

        this.btnAddMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadastroActivity.class);
                startActivityForResult(it, AGENDA);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == AGENDA) {
                Pessoa p = (Pessoa) data.getExtras().getSerializable("contato");
                // TODO: Exibir os dados
                Log.i("AGENDA", p.getNome());
                this.tvContactNameMain.setText(p.getNome() + " -> " + p.getEmail() + " -> " + p.getTelefone());
            }
        }
    }
}
