package com.example.joffily.simounao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_yes;
    Button btn_no;
    ImageView imagem;
    TextView text;
    Random rand = new Random();
    ArrayList<Imagem> imagens = new ArrayList<Imagem>();
    String ultimoAdquirido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagens.add(new Imagem(R.drawable.carrefour, "Carrefour"));
        imagens.add(new Imagem(R.drawable.ouro, "10 milhões em ouro"));
        imagens.add(new Imagem(R.drawable.uno, "Uno de firma"));


        this.text = (TextView) this.findViewById(R.id.text_response);
        this.btn_yes = (Button) this.findViewById(R.id.btn_yes);
        this.btn_no = (Button) this.findViewById(R.id.btn_no);

        // Imagem
        this.imagem =  (ImageView) this.findViewById(R.id.img_place);
        this.ultimoAdquirido = "Uno de firma";

        // Listener
        this.btn_yes.setOnClickListener(new HandleButtonClick());
        this.btn_no.setOnClickListener(new HandleButtonClick());
    }


    private class HandleButtonClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            ArrayList<Imagem> imagens = MainActivity.this.imagens;
            Integer resourceImageLen = imagens.size();
            Imagem selected = imagens.get(rand.nextInt(resourceImageLen));
            int resourceId = selected.getId();

            // Troca a imagem randomicamente
            MainActivity.this.imagem.setImageResource(resourceId);

            if (v.equals(MainActivity.this.btn_yes)) {
                MainActivity.this.text.setText("Você trocou: "+ MainActivity.this.ultimoAdquirido + " por " + selected.getName());
                MainActivity.this.ultimoAdquirido = selected.getName();
            } else {
                MainActivity.this.text.setText("Você não trocou: "+ MainActivity.this.ultimoAdquirido + " por " + selected.getName());
            }
        }
    }

}
