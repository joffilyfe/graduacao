package pdm.joffily.me.janela;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn1 = (Button) this.findViewById(R.id.btn1);
        this.btn2 = (Button) this.findViewById(R.id.btn2);
        this.btn3 = (Button) this.findViewById(R.id.btn3);


        this.btn1.setOnClickListener(new OnclickButton());
        this.btn2.setOnClickListener(new OnclickButton());
        this.btn3.setOnClickListener(new OnclickButton());

    }


    private class OnclickButton implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            final EditText input = new EditText(MainActivity.this);

//            if (v instanceof Button) {
//                Button x = (Button) v;
//                Log.i("Janela", x.getText().toString());
//                Toast.makeText(MainActivity.this, x.getText().toString(), Toast.LENGTH_SHORT).show();
//            }

            if (v.equals(MainActivity.this.btn1)) {
                builder.setTitle("Atenção");
                builder.setMessage("O botão 1 foi clicado");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.create();
                builder.setPositiveButton(R.string.btn_dialog_positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("MENSAGEM", "OK");
                    }
                });

                builder.setNegativeButton(R.string.btn_dialog_negative, null);
                builder.show();

            } else if (v.equals(MainActivity.this.btn2)) {
                builder.setTitle("Confirmação");
                builder.setMessage("Usuário, digite o seu nome");
                builder.setView(input);
                builder.setIcon(R.mipmap.ic_launcher);

                builder.setPositiveButton(R.string.btn_dialog_positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, input.getText(), Toast.LENGTH_SHORT ).show();
                    }
                });

                builder.setNegativeButton(R.string.btn_dialog_negative, null);
                builder.create();
                builder.show();
            }



        }
    }
}
