package pdm.joffily.me.guardadados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nomeText;
    DatePicker datePicker;
    Button btnAdd;
    private PessoaDAO pessoaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.nomeText = (EditText) this.findViewById(R.id.textNome);
        this.datePicker = (DatePicker) this.findViewById(R.id.datePicker);
        this.btnAdd = (Button) this.findViewById(R.id.btnAdd);


        this.datePicker.setCalendarViewShown(false);

        this.pessoaDAO = new PessoaDAO(this);



        this.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("GuardaDados", MainActivity.this.nomeText.getText().toString());
                String nome = MainActivity.this.nomeText.getText().toString();
                int dia = MainActivity.this.datePicker.getDayOfMonth();
                int mes = MainActivity.this.datePicker.getMonth();
                int ano = MainActivity.this.datePicker.getYear();
                Pessoa p = new Pessoa(nome, dia, mes, ano);
                MainActivity.this.pessoaDAO.insert(p);
                Log.i("GuardaDados", MainActivity.this.pessoaDAO.get().toString());
            }
        });
    }
}
