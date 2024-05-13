package objecttest;


public class ObjectTest {
    public static void main(String[] args) {
        Car carro = new Car();
        carro.cor = "Vermelho";
        carro.acentos = 5;
        carro.portas = 4;
        carro.modelo = "Sedan";
        carro.marca = "Porche";
        carro.status();
        carro.marcha();
        String qntporta = carro.qntporta();
        System.out.println(qntporta);
        
    }
    
}
