package classandobject;

public class ClassAndObject {
    public static void main(String[] args) {
       Pencil caneta = new Pencil();
       
       caneta.cor = "Preta";
       caneta.modelo = "Faber Castel";
       
       caneta.destampar();
       caneta.status();
       caneta.rabiscar();
       
    }
    
}
