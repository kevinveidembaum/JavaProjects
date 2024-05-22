package animalplanet;

public class Turtle extends Reptile{
    public Turtle(int idade, float peso, int membros) {
        this.idade = idade;
        this.peso = peso;
        this.membros = membros;
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando beeem devagar...");
    }
    
}
