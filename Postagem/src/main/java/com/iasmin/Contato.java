package com.iasmin;
import java.lang.*;
public class Contato  implements Observador{

    private String email;
    private Grupo grupowhats;

    public Contato(String email, Grupo grupowhats) {
        this.email = email;
        this.grupowhats = grupowhats;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Grupo getGrupowhats() {
        return grupowhats;
    }

    public void setGrupowhats(Grupo grupowhats) {
        this.grupowhats = grupowhats;
    }

    @Override
    public void atualizar() {
         String mensagem = grupowhats.getMensagem();
        System.out.println(mensagem);
        System.out.printf("Essa mensagem foi recebida: %s",getEmail());
    }

    @Override
    public String returnemail() {
        return getEmail();
    }
}
