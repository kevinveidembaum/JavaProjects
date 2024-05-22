package animalplanet;

public class Kangaroo extends Mammal{
    
    public Kangaroo(int idade, float peso, int membros) {
        this.idade = idade;
        this.peso = peso;
        this.membros = membros;
    }
    
    public void usarBolsa(){
        System.out.println("Usando Bolsa!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
