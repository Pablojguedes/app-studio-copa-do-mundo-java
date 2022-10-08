package com.example.app_studio_copa_do_mundo_java;

public class Selecao {

    private String pais;
    private String formacao;
    private String[] time;

    public Selecao(String pais, String formacao, String[] time) {
        this.pais = pais;
        this.formacao = formacao;
        this.time = time;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String[] getTime() {
        return time;
    }

    public void setTime(String[] time) {
        this.time = time;
    }
}
