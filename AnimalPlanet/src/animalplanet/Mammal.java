package animalplanet;

public abstract class Mammal extends Animal {
    protected String corPelo;

    
    @Override
    public void locomover(){
        System.out.println("Andar");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som Mamifero");
    }
    
    public String getPelo(){
        return corPelo;
    }
    
    public void setPelo(String pelo){
        this.corPelo = pelo;
    }
    
    
}
