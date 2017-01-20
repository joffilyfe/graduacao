package pdm.joffily.me.arrocha;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textMininimo;
    private TextView textMaximo;
    private Button btnChutar;
    private Random random = new Random();
    private int numeroSecreto = random.nextInt(99 - 1) + 1;
    private int menor = 1;
    private int maior = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = (EditText) this.findViewById(R.id.editText);
        this.textMininimo = (TextView) this.findViewById(R.id.textMinimo);
        this.textMaximo = (TextView) this.findViewById(R.id.textMaximo);
        this.btnChutar = (Button) this.findViewById(R.id.btnChutar);

        this.btnChutar.setOnClickListener(new OnButtonClick());
        Log.i("Arrocha", "Número secreto:" + Integer.toString(this.numeroSecreto));
    }


    private class OnButtonClick implements View.OnClickListener {

        public void showDialog(String texto) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Arrocha");
            builder.setMessage(texto);
            builder.create();
            builder.show();
        }

        @Override
        public void onClick(View v) {
            String chute = MainActivity.this.editText.getText().toString();

            if (chute.equals("") || !chute.matches("^\\d+$")) {
                Log.i("Arrocha", "Número inválido!");
                return;
            }

            int numero = Integer.parseInt(chute);

            if (numero < MainActivity.this.menor) {
                this.showDialog("Número menor do que o permitido. Você perdeu");
                return;
            } else if (numero > MainActivity.this.maior) {
                this.showDialog("Número maior do que o permitido. Você perdeu");
                return;
            }


            if (numero > MainActivity.this.menor && numero < MainActivity.this.numeroSecreto) {
                MainActivity.this.textMininimo.setText(Integer.toString(numero));
                MainActivity.this.menor = numero;
            } else if (numero > MainActivity.this.numeroSecreto && numero < MainActivity.this.maior) {
                MainActivity.this.textMaximo.setText(Integer.toString(numero));
                MainActivity.this.maior = numero;
            } else if (numero == MainActivity.this.numeroSecreto) {
                this.showDialog("Você acertou!");
            }

            if (MainActivity.this.maior - MainActivity.this.menor == 2) {
                Log.i("Arrocha", "Número arrochado, você perdeu");
                this.showDialog("Número arrochado, você perdeu");
            }
        }

    }
}
