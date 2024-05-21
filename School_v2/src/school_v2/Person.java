package school_v2;

public abstract class Person {
    protected String nome, sexo;
    protected int idade;

    public void fazerAniver(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", sexo = " + sexo + ", idade = " + idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
