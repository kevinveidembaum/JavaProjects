package classandobject;

public class Pencil {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Caneta " + this.cor);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Com a ponta "+ this.ponta);
        System.out.println("Com carga de " + this.carga +"%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não posso rabiscar, caneta está tampada!");
        }else{
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar(){
        this.tampada = true;
        System.out.println("A caneta foi tampada!");
    }
    
    public void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi Destampada!");
    }
    
}
