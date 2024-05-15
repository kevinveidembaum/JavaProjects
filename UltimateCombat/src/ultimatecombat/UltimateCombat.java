package ultimatecombat;

public class UltimateCombat {

    public static void main(String[] args) {
        
        Fighter l[] = new Fighter[6];
                
        l[0] = new Fighter("Mohaamed", "India", 20, 19, 3, 0, 1.68f, 66);        
        l[1] = new Fighter("Putsctript", "Brasil", 34, 24, 6, 2, 1.78f, 70);
        l[2] = new Fighter("Alemao", "Alemanha", 25, 13, 2, 1, 1.80f, 83.3f);
        l[3] = new Fighter("Draco", "Russia", 23, 17, 1, 0, 1.85f, 80);
        l[4] = new Fighter("Mc n Cheese", "EUA", 20, 14, 9, 1, 1.75f, 105.4f);
        l[5] = new Fighter("Guacamole", "Mexico", 28, 33, 10, 3, 1.72f, 108.4f);
        
        l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();
        
    }
    
}
