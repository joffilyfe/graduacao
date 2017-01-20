package pdm.joffily.me.feelings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Registro> lista = new ArrayList<Registro>();
    private ListView mainList;
    private Button btnChamaFormulario;
    private static final int REGISTRO_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mainList = (ListView) this.findViewById(R.id.mainRegistroList);
        this.btnChamaFormulario = (Button) this.findViewById(R.id.mainBtnChamaFormulario);

        // Cria o adapter
        RegistroBaseAdapter registroAdapter = new RegistroBaseAdapter(this, this.lista);
        this.mainList.setAdapter(registroAdapter);

        this.btnChamaFormulario.setOnClickListener(new HandleCallFormularioIntent());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REGISTRO_CODE) {
            Registro r = (Registro) data.getExtras().getSerializable("Registro");
            Log.i("Feelings", r.getTitulo());
            Log.i("Feelings", "resultado");
            this.lista.add(r);
            ((RegistroBaseAdapter)this.mainList.getAdapter()).notifyDataSetChanged();
        }
    }

    private class HandleCallFormularioIntent implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, FormularioActivity.class);
            startActivityForResult(i, REGISTRO_CODE);
        }
    }
}
