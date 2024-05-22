package animalplanet;

public abstract class Fish extends Animal {
    protected String corEscama;

   
    
    public void soltarBolha(){
        System.out.println("Soltando Bolha...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comer substancias");
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe nao emite som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
    
}
