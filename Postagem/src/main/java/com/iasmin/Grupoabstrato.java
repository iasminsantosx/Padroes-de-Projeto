package com.iasmin;

import java.util.ArrayList;

public class Grupoabstrato {
    private ArrayList<Observador> listaobservadores;

    public Grupoabstrato(ArrayList<Observador> listaobservadores) {
        this.listaobservadores = listaobservadores;
    }

    public Grupoabstrato() {
        listaobservadores = new ArrayList<Observador>();
    }

    public String add(Observador b) {
        for (Observador b1 : listaobservadores) {
            if (b1.returnemail().equals(b.returnemail())) {
                return "Esse contato já foi adicionado ao país anteriormente.";
            }
        }
        listaobservadores.add(b);
        return " Contato adicionado.";
    }

    public String del (Observador b){
            for(int i =0; i< listaobservadores.size();i++){
                if(listaobservadores.get(i).returnemail().equals(b.returnemail())){
                    listaobservadores.remove(i);
                    return "Contato removido com sucesso";
                }

            }
            return "Contato não encontrado";

    }

    public void notificar(String remetente){
         for ( Observador b : listaobservadores){
             if(!b.returnemail().equals(remetente)){
                 b.atualizar();
             }

         }
    }

    @Override
    public String toString() {
        String retorno = null;
        ArrayList<String>lista = new ArrayList<String>();
        for(int i=0;i<listaobservadores.size();i++){
            lista.add(listaobservadores.get(i).returnemail());
        }
        retorno = "Grupo contém:{" +
                "listaobservadores=" + lista +
                '}';
        return retorno;

    }
}
