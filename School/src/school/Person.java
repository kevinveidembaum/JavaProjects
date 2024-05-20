package school;

public class Person {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("A pessoa " + this.getNome() + " agora tem " + this.getIdade());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Person{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
}
