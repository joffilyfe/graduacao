package pdm.joffily.me.bbateria;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Joffily on 20/01/17.
 */

public class CarregadorReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context ctx, Intent it) {
        Toast.makeText(ctx, it.getAction(), Toast.LENGTH_SHORT).show();
    }
}
