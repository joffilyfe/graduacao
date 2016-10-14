package br.edu.ifpb.si.pdm.tagarela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_yes;
    private Button btn_not;

    // TODO: Fazer a imagem trocar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn_yes = (Button)this.findViewById(R.id.yes);
        this.btn_not = (Button)this.findViewById(R.id.not);

        this.btn_yes.setOnClickListener(new ButtonClick());

    }


    private class ButtonClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            // TODO: fazer o telefone falar
        }
    }
}
