package pdm.joffily.me.loteria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private Set<Integer> numeros = new TreeSet<Integer>();
    private Button btnGerar;
    private TextView numerosText;

    private String generateNumber() {

        String saida = "";
        Random random = new Random();
        this.numeros.clear();

        while(numeros.size() < 6) {
            numeros.add(random.nextInt(60 - 1) + 1);
        }

        for (Integer n : numeros) {
            saida += Integer.toString(n) + " ";
        }

        return saida;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnGerar = (Button) this.findViewById(R.id.btnGerar);
        this.numerosText = (TextView) this.findViewById(R.id.numerosText);

        this.btnGerar.setOnClickListener(new ButtonClickHandler());

    }

    private class ButtonClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            MainActivity.this.numerosText.setText(MainActivity.this.generateNumber());
        }
    }
}
