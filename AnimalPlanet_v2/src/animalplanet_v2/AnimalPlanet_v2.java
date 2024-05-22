package animalplanet_v2;

public class AnimalPlanet_v2 {

    public static void main(String[] args) {
        //main 
        Wolf w = new Wolf();
        Dog d = new  Dog();
        w.emitirSom();
        d.emitirSom();
        d.reagir("Bom garoto");
        d.reagir("toma comida");
        d.reagir(12,56);
        d.reagir(false);
        d.reagir(13, 13f);
        
        
    }
    
}
