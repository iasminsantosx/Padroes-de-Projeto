package com.iasmin;
import java.util.Arrays;
import java.util.Scanner;
public class Menu {
    Grupo g1;
    Scanner input = new Scanner(System.in);
    String email;
    public void Menu(){
        System.out.println("Para Adicionar um contato ao grupo digite de acordo com o exemplo: postagem add aluno.x@academico.ifpb.edu.br \n"+
                "Para remover um contatdo do grupo digite de acordo com o exemplo:  postagem del aluno.x@academico.ifpb.edu.br\n "+
                "Para simular a postagem de uma mensagem por um dado usuário ativo, aplicação deve ser chamada de acordo com o exemplo: postagem aluno.x@academico.ifpb.edu.br 'mensagem ........'");

       g1 = new Grupo();
        while(true){
            String comando = input.nextLine();
            String subcomandos[] = comando.split(" ");
            if (subcomandos[0].equals("sair")){
                break;
            }
            else {
                if (!subcomandos[0].equals("postagem")){
                    System.out.println("Comando não encontrado,digite novamente.");
                }
                else{
                    if(subcomandos[1].equals("add")){
                        email = subcomandos[2];
                        Contato c1 = new Contato(email,g1);
                        String retorno = g1.add(c1);
                        System.out.println(retorno);
                    }
                    else if (subcomandos[1].equals("del")){
                        email= subcomandos[2];
                        Contato c1 = new Contato(email,g1);
                        String retorno = g1.del(c1);
                        System.out.println(retorno);
                        System.out.println(g1.toString());
                    }
                    else {
                        String remetente = subcomandos[1];
                        String[] msgTeste = Arrays.copyOfRange(subcomandos,2,subcomandos.length);
                        String mensagem_adptada = String.join(" ", msgTeste);;
                        g1.setMensagem(mensagem_adptada,remetente);
                    }
                }
            }
        }


    }
}
