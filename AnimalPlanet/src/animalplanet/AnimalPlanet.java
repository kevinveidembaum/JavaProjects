package animalplanet;

public class AnimalPlanet {

    public static void main(String[] args) {
        Dog d = new Dog(2, 10.3f, 4);
        d.enterrarOssos();
        d.abanarRabo();
        d.locomover();
        
        Kangaroo k = new Kangaroo(4, 30.4f, 4);
        k.locomover();
        k.usarBolsa();
        
        Snake s = new Snake(5, 12, 0);
        s.alimentar();
        s.locomover();
        s.emitirSom();
        
        Turtle t = new Turtle(109, 15.2f, 4);
        t.locomover();
        
        Goldfish g = new Goldfish(1, 0.3f, 2);
        g.alimentar();
        g.locomover();
        g.emitirSom();
        
        Macaw m = new Macaw(6, 0.53f, 4);
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println(d.toString());
        System.out.println(k.toString());
        System.out.println(s.toString());
        System.out.println(t.toString());
        System.out.println(g.toString());
        System.out.println(m.toString());
    }
    
}
