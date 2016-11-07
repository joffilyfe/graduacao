package pdm.joffily.me.kerolanche;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joffily on 07/11/16.
 */

public class RestaurantesAdapter extends BaseAdapter {

    Context context;
    List<String> lista;

    public RestaurantesAdapter(Context context, List<String> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return this.lista.size();
    }

    @Override
    public Object getItem(int i) {
        return this.lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater li = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.celula_restaurante, null);
        }

        TextView tv = (TextView) view.findViewById(R.id.celulaRestauranteList);
        tv.setText(this.lista.get(i));

        return view;
    }
}
