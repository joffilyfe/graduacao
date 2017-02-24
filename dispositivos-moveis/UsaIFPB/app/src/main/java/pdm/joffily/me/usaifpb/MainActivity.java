package pdm.joffily.me.usaifpb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnUsaIFPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnUsaIFPB = (Button) this.findViewById(R.id.btnUsaIFPB);

        this.btnUsaIFPB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent("IFPB");

                if (it.resolveActivity(getPackageManager()) != null) {
                    startActivity(it);
                }
            }
        });
    }
}
