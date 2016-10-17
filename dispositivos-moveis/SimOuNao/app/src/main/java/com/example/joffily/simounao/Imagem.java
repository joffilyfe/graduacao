package com.example.joffily.simounao;

/**
 * Created by joffily on 17/10/16.
 */

public class Imagem {
    private Integer id;
    private String name;

    public Imagem() {}
    public Imagem(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }
}
