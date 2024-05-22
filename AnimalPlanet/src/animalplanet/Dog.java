package animalplanet;

public class Dog extends Mammal{

    public Dog(int idade, float peso, int membros) {
        this.idade = idade;
        this.peso = peso;
        this.membros = membros;
    }
    
    public void enterrarOssos(){
        System.out.println("Enterrando ossos");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo!");
    }
}
