package meuiphone;
public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone(); 

        //AparelhoTelefonico
        iphone.ligar("(48)999707031");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Musica - Stolen Dance - Milky Chance");

        // Testando NavegadorInternet
        iphone.exibirPagina("https://github.com/Gabrielggoulart");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
