package pdm.joffily.me.usaautenticacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnfazLogin;
    private TextView tvResultado;
    private static final int LOGIN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.tvResultado = (TextView) this.findViewById(R.id.tvResultado);
        this.btnfazLogin = (Button) this.findViewById(R.id.btnfazLogin);

        this.btnfazLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent("autenticacao");

                if (it.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(it, LOGIN);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == LOGIN) {
                // Log.i("Autenticacao", data.getStringExtra("login"));
                tvResultado.setText(data.getStringExtra("login"));
                Log.i("Autenticacao", data.getExtras().get("login").toString());
            }
        }
    }
}
