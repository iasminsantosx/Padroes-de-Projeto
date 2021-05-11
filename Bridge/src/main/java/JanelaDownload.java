public class JanelaDownload extends JanelaAbstrata{
    public JanelaDownload(JanelaImplementada j) {
        super(j);
    }
    @Override
    public void desenhar() {
        desenharJanela("Janela Download");
        desenharBotao("Insira o local onde deseja que faça o download");
        desenharBotao(" Botão Sim");
        desenharBotao(" Botão Não");
    }
}
