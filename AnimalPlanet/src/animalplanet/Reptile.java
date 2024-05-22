package animalplanet;

public abstract class Reptile extends Animal{
    protected String corEscama;

    
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comer vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil");
    }
    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
