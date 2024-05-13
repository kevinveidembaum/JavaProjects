package classandobject;

public class ClassAndObject {
    public static void main(String[] args) {
       Pencil caneta1 = new Pencil();
       
       caneta1.cor = "Vermelha";
       caneta1.carga = 50;
       caneta1.modelo = "Bic";
       caneta1.ponta = 0.5f;       
       
       caneta1.destampar();
       caneta1.rabiscar();
       caneta1.status();
       
    }
    
}
