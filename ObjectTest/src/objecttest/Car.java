package objecttest;

public class Car {
    String modelo, cor, marca;
    boolean manual;
    int acentos, portas;
    
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Manual? "+ this.manual);
        System.out.println("Acentos: "+ this.acentos);
        System.out.println("Portas: "+ this.portas);
    }
    
    void marcha(){
        if(this.manual == true){
            System.out.println("Este carro nao tem cambio!");
        }else{
            System.out.println("Esse carro possui cambio!");
        }
    }
    
    String qntporta(){
        if(this.portas <= 2){
            return "Carro é chique ou velho";
        }else{
            return "Carro Padrao";
        }
    }
    
}
