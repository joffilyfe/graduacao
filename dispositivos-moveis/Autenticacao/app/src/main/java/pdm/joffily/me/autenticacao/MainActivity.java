package pdm.joffily.me.autenticacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText eTLogin;
    private EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.eTLogin = (EditText) this.findViewById(R.id.eTLogin);
        this.etSenha = (EditText) this.findViewById(R.id.eTSenha);
        this.btnLogin = (Button) this.findViewById(R.id.btnLogin);


        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent();
                it.putExtra("login", validateLogin(eTLogin.getText().toString(), etSenha.getText().toString()));
                setResult(RESULT_OK, it);
                finish();
            }
        });
    }

    private String validateLogin(String login, String senha) {

        if (login.equals("joffily") && senha.equals("ifpb")) {
            return "Login Válido";
        }
        return "Login Inválido";
    }


}
