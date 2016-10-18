package pdm.joffily.me.windows;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int PALAVRA = 1;
    Button btnSobre;
    Button btnPalavra;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnSobre = (Button) this.findViewById(R.id.btn_about);
        this.btnPalavra = (Button) this.findViewById(R.id.btn_palavra);
        this.textView = (TextView) this.findViewById(R.id.textview_main);

        this.btnSobre.setOnClickListener(new HandleOnclickButton());
        this.btnPalavra.setOnClickListener(new HandleOnclickButton());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == PALAVRA) {
                // #TODO: Show data result from PalavraActivity in TextView
                Log.i("WINDOWS", data.getStringExtra("palavra"));
            }
        }
    }

    private class HandleOnclickButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if (v.equals(MainActivity.this.btnSobre)) {
                Log.i("WINDOWS", "CLICOU em sobre!");
                Intent it = new Intent(MainActivity.this, SobreActivity.class);
                startActivity(it);
            } else if (v.equals(MainActivity.this.btnPalavra)) {
                Intent it = new Intent(MainActivity.this, PalavraActivity.class);

                // #LOOK: Chama um Intent e espera uma resposta
                startActivityForResult(it, PALAVRA);
            }

        }
    }
}
