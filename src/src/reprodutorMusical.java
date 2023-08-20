import java.util.Scanner;

public class reprodutorMusical implements Aparelho{

    UI ui = new UI();

    private boolean on;
    private boolean reproduzindo;
    private String musicaAtual;

    public reprodutorMusical(){
        this.on = false;
        this.reproduzindo = false;
        this.musicaAtual = "";
    }

    @Override
    public void ligar() {
        on = true;
        ui.escrever("Reprodutor musical está on.");
    }

    @Override
    public void desligar() {
        on = false;
        ui.escrever("Reprodutor musical está off.");
    }

    @Override
    public boolean ligado() {
        return on;
    }

    public void tocar(String musica){
        if (ligado()) {
            reproduzindo = true;
            ui.escrever("Reproduzindo: " + musica);
        } else {
            ui.escrever("Para tocar a música o dispositivo precisa ser ligado para utiliza-lo.");
        }
    }

    public void pausar() {
        if (reproduzindo) {
            ui.escrever("Pausando a música atual.");
        } else {
            ui.escrever("Para pausar a musica o dispositivo precisa ser ligado.");
        }
    }

    public void selecionarMusica(String musica){
        if (ligado()) {
            musicaAtual = musica;
            ui.escrever("Música selecionada: "+musica);
        } else {
            ui.escrever("Para selecionar uma música, o reprodutor precisa estar ligado.");
        }
    }

    public void reproduzirMusicaAtual(){
        if (ligado()) {
            if (!musicaAtual.isEmpty()){
                reproduzindo = true;
                ui.escrever("Reproduzindo: "+musicaAtual);
            } else {
                ui.escrever("Nenhuma música foi selecionada para reprodução ainda.");
            }
        } else {
            ui.escrever("O reprodutor musical está off.");
        }
    }
}
