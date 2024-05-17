package reader;

public class Reader {

    public static void main(String[] args) {
        Person[] p = new Person[2];
        Book[] b = new Book[3];
        
        p[0] = new Person("Gabriela", "Feminino", 23);
        p[1] = new Person("Josue", "Masculino", 46);
        
        b[0] = new Book("Harry Potter", "JK Rowling", 700, p[0]);
        b[1] = new Book("Senhor dos Aneis", "Tolkien", 900, p[1]);
        b[2] = new Book("Star Wars", "George Lucca", 500, p[0]);
        
        for (Person p1 : p){
            p1.fazerAniver();
            p1.status();
        }
        
        for (Book b1 : b) {
            b1.abrir();
            b1.folhear();
            b1.detalhes();
        }
       
    }
}
