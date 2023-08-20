public class navegadorInternet implements Aparelho{

    UI ui = new UI();
    private boolean on;
    private boolean navegando;
    private String paginaAtual;

    public navegadorInternet(){
        this.on = false;
        this.navegando = false;
        this.paginaAtual = "";
    }

    @Override
    public void ligar() {
        on = true;
        ui.escrever("Navegador de Internet está on.");
    }

    @Override
    public void desligar() {
        on = false;
        ui.escrever("Navegador de Internet está off.");
    }

    @Override
    public boolean ligado() {
        return on;
    }

    public void abrirPagina(String url) {
        if(ligado()){
            paginaAtual = url;
            navegando = true;
            ui.escrever("Abrindo página "+ url);
        } else {
            ui.escrever("O navegador de internet está offline");
        }
    }

    public void exibirPagina() {
        if (navegando){
            ui.escrever("Exibindo página atual: "+paginaAtual);
        } else {
            ui.escrever("Nenhuma página está sendo exibida");
        }
    }

    public void adicionarNovaAba(String url){
        if (ligado()) {
            ui.escrever("Abrindo nova aba com página: "+url);
            paginaAtual = url;
        } else {
            ui.escrever("O navegador de internet está desligado.");
        }
    }

    public void atualizarPagina(){
        if (navegando){
            ui.escrever("Atualizando página: "+paginaAtual);
        } else {
            ui.escrever("Nehuma página está sendo exibida para ser atualizada.");
        }
    }

}
