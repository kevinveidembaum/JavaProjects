package reader;

import java.time.LocalDate;

public class Person {
    private String nome, sexo;
    private int idade;

    public Person(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public void status(){
        System.out.println("============================");
        System.out.println("Nome: " +this.getNome());
        System.out.println("Idade: " +this.getIdade());
        System.out.println("Do sexo: " +this.getSexo());
    }
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
        
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int anoNasc = anoAtual - this.getIdade();
        
        System.out.println("=============================");
        System.out.println("Congratulations!!");
        System.out.println("Nascido em "+ anoNasc);
        System.out.println("Hoje e aniversario do(a) "+ this.getNome());
        System.out.println("E ele(a) esta completando "+ this.getIdade());
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
}
