package com.iasmin;

import java.util.ArrayList;

public class Grupo extends Grupoabstrato {
    private String mensagem;

    public Grupo() {
        this.mensagem = "Olá,sou novo no grupo!";
    }

    public Grupo( String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String menssagem,String remetente) {
        this.mensagem = menssagem;
        notificar(remetente);
    }


}
