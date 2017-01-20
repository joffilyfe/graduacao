package pdm.joffily.me.feelings;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by joffily on 19/01/17.
 */

public class RegistroBaseAdapter extends BaseAdapter {
    Context context;
    List<Registro> lista;

    public RegistroBaseAdapter(Context ctx, List<Registro> lista) {
        this.context = ctx;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater li = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.celula_layout, null);
        }

        TextView textview = (TextView) convertView.findViewById(R.id.clulaTextList);

        // Seta o título na visualização da lista
        textview.setText(this.lista.get(position).getTitulo());
        return convertView;
    }
}
