
public class aparelhoTelefonico implements Aparelho{
    UI ui = new UI();
    private boolean on;
    private boolean chamadaAtiva;
    private boolean correioVoz;

    public aparelhoTelefonico(){
        this.on = false;
        this.chamadaAtiva = false;
        this.correioVoz = false;
    }
    @Override
    public void ligar() {
        on = true;
        System.out.println("O aparelho está on.");
    }

    @Override
    public void desligar() {
        on = false;
        System.out.println("O aparelho está off.");
    }

    @Override
    public boolean ligado() {
        return on;
    }

    public void fazerLigacao(String numero){
        if(ligado()) {
            System.out.println("Ligando para "+numero);
        } else {
            System.out.println("O aparelho telefônico está desligado.");
        }
    }

    public void atender(){
        if (chamadaAtiva){
            ui.escrever("Chamada Atendida");
            chamadaAtiva = false;
        } else {
            ui.escrever("Não há chamadas para atender");
        }
    }

    public void iniciarCorreioVoz(){
        if (chamadaAtiva){
            ui.escrever("Iniciando correio de voz");
            correioVoz = true;
            chamadaAtiva = false;
        } else{
            ui.escrever("Não há chamadas ativas para iniciar o correio de voz");
        }
    }

    public void verificarCorreioVoz(){
        if (correioVoz){
            ui.escrever("Você tem novas mensagens no correio de voz.");
        } else {
            ui.escrever("Não há novas mensagens no correio de voz.");
        }
    }
}
