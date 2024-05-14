package bankaccount;

public class BankAccount {

    public static void main(String[] args) {
        Account pessoa = new Account();
        
        pessoa.abrirConta("CC");
        pessoa.setDono("Jubileu");
        pessoa.setNumConta(157);
        pessoa.depositar(300);
        pessoa.sacar(350);
        pessoa.fecharConta();
        
        
        Account pessoa2 = new Account();
        
        pessoa2.abrirConta("CP");
        pessoa2.setDono("Creuza");
        pessoa2.setNumConta(69);
        pessoa2.depositar(500);
        pessoa2.sacar(100);
        
        pessoa.estadoAtual();
        pessoa2.estadoAtual();
        
        
        
    }
    
}
