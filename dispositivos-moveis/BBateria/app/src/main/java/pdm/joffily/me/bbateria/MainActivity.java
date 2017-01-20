package pdm.joffily.me.bbateria;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> status;
    private CarregadorReceiverDinamico receiverDinamico;
    private IntentFilter itf;

    public MainActivity() {
        this.status = new ArrayList<String>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.listView = (ListView) this.findViewById(R.id.mainListView);

        // Array Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.status);
        listView.setAdapter(adapter);

        this.receiverDinamico = new CarregadorReceiverDinamico();
        this.itf = new IntentFilter();
        this.itf.addAction(Intent.ACTION_POWER_CONNECTED);
        this.itf.addAction(Intent.ACTION_POWER_DISCONNECTED);
    }


    protected void onResume() {
        super.onResume();
        registerReceiver(this.receiverDinamico, this.itf);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.receiverDinamico);
    }

    private class CarregadorReceiverDinamico extends BroadcastReceiver {
        public void onReceive(Context ctx, Intent it) {
            switch(it.getAction()) {
                case Intent.ACTION_POWER_CONNECTED:
                    MainActivity.this.status.add("Conectou");
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    MainActivity.this.status.add("Desconectou");
                    break;
                default:
                    MainActivity.this.status.add("Não sei");
                    break;
            }

            ((ArrayAdapter)MainActivity.this.listView.getAdapter()).notifyDataSetChanged();
        }
    }
}
