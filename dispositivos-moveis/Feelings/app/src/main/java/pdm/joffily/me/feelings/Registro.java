package pdm.joffily.me.feelings;

import java.io.Serializable;

/**
 * Created by joffily on 19/01/17.
 */

/*
* Implementar o Serializable permite que passemos instâncias dessa classe pela Intent
*/
public class Registro implements Serializable {
    private String titulo;
    private String descricao;
    private String nota;
    private String observacoes;

    public Registro(String titulo, String desc, String nota, String obs) {
        this.titulo = titulo;
        this.descricao = desc;
        this.nota = nota;
        this.observacoes = obs;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
