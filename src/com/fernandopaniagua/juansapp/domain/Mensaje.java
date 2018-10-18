package com.fernandopaniagua.juansapp.domain;

public class Mensaje {
    private int id;
    private String emisor;
    private String texto;

    public Mensaje(int id, String emisor, String texto) {
        this.id = id;
        this.emisor = emisor;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
