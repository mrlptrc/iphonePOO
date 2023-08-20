import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        reprodutorMusical reprodutor = new reprodutorMusical();
        navegadorInternet navegador = new navegadorInternet();
        aparelhoTelefonico telefone = new aparelhoTelefonico();
        UI ui = new UI();

        reprodutor.ligar();
        reprodutor.selecionarMusica(ui.pedeInfo("Digite a música que quer selecionar: "));
        reprodutor.reproduzirMusicaAtual();
        reprodutor.pausar();
        ui.escrever("");

        telefone.ligar();
        telefone.fazerLigacao(ui.pedeInfo("Digite o número para que deseja ligar."));
        telefone.atender();
        telefone.iniciarCorreioVoz();
        telefone.verificarCorreioVoz();
        ui.escrever("");

        navegador.ligar();
        navegador.abrirPagina(ui.pedeInfo("Digite a URL que deseja abrir."));
        navegador.exibirPagina();
        navegador.adicionarNovaAba(ui.pedeInfo("Informe o URL da nova aba."));
        navegador.atualizarPagina();
    }
}
