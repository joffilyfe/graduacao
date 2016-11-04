package pdm.joffily.me.kerolanche;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMain;
    private Button btnAdicionarMain;
    private ListView listViewMain;
    private List<String> lista;

    public MainActivity() {
        this.lista = new ArrayList<String>();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editTextMain = (EditText) this.findViewById(R.id.editTextMain);
        this.btnAdicionarMain = (Button) this.findViewById(R.id.btnAdicionarMain);
        this.listViewMain = (ListView) this.findViewById(R.id.listViewMain);

        this.btnAdicionarMain.setOnClickListener(new OnClickBotao());


        // #READ: O list view precisa de um Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.lista);
        this.listViewMain.setAdapter(adapter);
        this.listViewMain.setOnItemClickListener(new OnClickItemLista());
    }

    private class OnClickBotao implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String estabelecimento = MainActivity.this.editTextMain.getText().toString();

            if (estabelecimento.length() > 0) {
                MainActivity.this.lista.add(estabelecimento);
                MainActivity.this.editTextMain.setText("");
                ((ArrayAdapter)MainActivity.this.listViewMain.getAdapter()).notifyDataSetChanged();
            }

        }
    }

    private class OnClickItemLista implements AdapterView.OnItemClickListener {

        public void onItemClick(AdapterView<?> parente, View view, int position, long id) {
            String lugar = MainActivity.this.lista.get(position);
            Toast.makeText(MainActivity.this, lugar, Toast.LENGTH_LONG).show();
        }
    }


    // TODO: Adicionar o click longo para remover o item da lista
}
