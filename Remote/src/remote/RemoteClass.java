package remote;

public class RemoteClass implements RemoteInterface {
    private int volume;
    private boolean ligado, tocando;
    
    public RemoteClass(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return volume;
    }
    
    private boolean isLigado(){
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("=======Menu===========");
        System.out.println("Ligado? " +this.isLigado());
        System.out.println("Tocando? " +this.isTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i = 0; i <= this.getVolume();i += 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
    
}
