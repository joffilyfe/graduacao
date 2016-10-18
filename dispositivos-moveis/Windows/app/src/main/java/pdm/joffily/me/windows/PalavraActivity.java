package pdm.joffily.me.windows;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PalavraActivity extends AppCompatActivity {

    Button btnSalvar;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palavra);


        this.btnSalvar = (Button) this.findViewById(R.id.btn_save_palavra);
        this.editText = (EditText) this.findViewById(R.id.edit_text_palavra);

        this.btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = PalavraActivity.this.editText.getText().toString();
                Intent it = new Intent();
                it.putExtra("palavra", texto);
                setResult(RESULT_OK, it);
                finish();
            }
        });
    }
}
