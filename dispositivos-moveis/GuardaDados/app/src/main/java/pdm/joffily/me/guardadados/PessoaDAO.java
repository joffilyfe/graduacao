package pdm.joffily.me.guardadados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 27/01/17.
 */

public class PessoaDAO {

    private SQLiteDatabase banco;

    public PessoaDAO(Context context) {
        this.banco = new BancoHelper(context).getWritableDatabase();
    }

    public void insert(Pessoa pessoa) {
        ContentValues cv = new ContentValues();
        cv.put("nome", pessoa.getNome());
        cv.put("aniversario", pessoa.getCalendario().getTimeInMillis());
        this.banco.insert("Pessoa", null, cv);
    }


    public List<Pessoa> get() {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String colunas[] = {"codigo", "nome", "aniversario"};
        Cursor c = this.banco.query("pessoa", colunas, null, null, null, null, "nome");

        if (c.getCount() > 0) {
            c.moveToFirst();


            do {
                int codigo = c.getInt(c.getColumnIndex("codigo"));
                String nome = c.getString(c.getColumnIndex("nome"));
                long aniversario = c.getLong(c.getColumnIndex("aniversario"));

                Pessoa pessoa = new Pessoa(codigo, nome, aniversario);
                lista.add(pessoa);

            } while(c.moveToNext());

        }

        return lista;
    }
}
