package pdm.joffily.me.guardadados;

import java.util.Calendar;

/**
 * Created by admin on 27/01/17.
 */

public class Pessoa {
    private String nome;
    private Calendar calendario;
    int codigo;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.calendario = Calendar.getInstance();
        this.calendario.set(ano, mes, dia);
    }

    public Pessoa(int codigo, String nome, long milis) {
        this.nome = nome;
        this.codigo = codigo;
        this.calendario = Calendar.getInstance();
        this.calendario.setTimeInMillis(milis);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getCalendario() {
        return this.calendario;
    }

    public String getDataString() {
        return String.format("%s/%s/%s",
                this.calendario.get(Calendar.DAY_OF_MONTH),
                this.calendario.get(Calendar.MONTH) + 1,
                this.calendario.get(Calendar.YEAR)
        );
    }


    public String toString() {
        return this.nome;
    }
}
