package br.edu.ifpb.si.pdm.numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    public MainActivity() {
        Log.i("NUMERO", "Construtor");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("NUMERO", "onCreate");

        this.btn1 = (Button)this.findViewById(R.id.btn1);
        this.btn2 = (Button)this.findViewById(R.id.btn2);

        this.btn1.setOnClickListener(new OnClickBotao());
        this.btn2.setOnClickListener(new OnClickBotao());

        this.btn1.setOnLongClickListener(new OnLongClickBotao());
    }


    private class OnClickBotao implements View.OnClickListener {

        public void onClick(View v) {

            if (v.equals(MainActivity.this.btn1)) {
                Log.i("NUMERO", "Clicou BTN 1");
            } else if (v.equals(MainActivity.this.btn2)) {
                Log.i("NUMERO", "Clicou BTN 2");
            }
        }
    }


    private class OnLongClickBotao implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            Log.i("NUMERO", "A melhor instituição do mundo: IFPB");
            return true;
        }
    }
}
