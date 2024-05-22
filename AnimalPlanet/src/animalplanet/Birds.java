package animalplanet;

public abstract class Birds extends Animal {
    protected String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo Ninho!");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comer frutas");
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
