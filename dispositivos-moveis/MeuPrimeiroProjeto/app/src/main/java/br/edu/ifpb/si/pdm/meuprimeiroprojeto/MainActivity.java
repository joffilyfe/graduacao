package br.edu.ifpb.si.pdm.meuprimeiroprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = (TextView)this.findViewById(R.id.tvNome);
        this.button = (Button)this.findViewById(R.id.btOk);


        if (this.button.performClick()) {
            this.textView.setText("IFPB");
        }
    }

    public void onClick(View view) {
    }
}
