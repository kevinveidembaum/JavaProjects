package shopping;

import java.util.Random;

public class Shopping {

    public static void main(String[] args) {
        Clients[] c = new Clients[3];
        Products[] p = new Products[3];

        //Clientes
        c[0] = new Clients("Roberta", 120);
        c[1] = new Clients("Jamilton", 250);
        c[2] = new Clients("Pangare", 50);
        //Produtos
        p[0] = new Products(12, "Sabonete", 5.9f);
        p[1] = new Products(30, "Nuggets", 10.5f);
        p[2] = new Products(26, "Salgadinho", 7.8f);
        
        //lista dos clientes
        for(Clients c1 : c){
            System.out.println(c1.toString());
        }
        
        //lista dos produtos
        for(Products p1 : p){
            System.out.println(p1.toString());
        }
        
        for(int i=0; i<c.length;i++){
            Random n = new Random();
            int aleatorio = n.nextInt(p[i].getQuantTotal());
            p[i].comprar(c[i], aleatorio);
        }
        
        //lista dos clientes
        for(Clients c1 : c){
            System.out.println(c1.toString());
        }
        
        //lista dos produtos
        for(Products p1 : p){
            System.out.println(p1.toString());
        }
        
    }
    
}
