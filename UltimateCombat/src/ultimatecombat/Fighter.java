package ultimatecombat;

public class Fighter {
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, derrota, empate;
    private float altura, peso;

    public Fighter(String nome, String nacionalidade, int idade, int vitoria, int derrota, int empate, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
        this.altura = altura;
        this.setPeso(peso);
    }
    
    public void apresentar(){
        System.out.println("LADIES AND GENTLEMAN");
        System.out.println("Apresentando " + this.getNome());
        System.out.println("Vindo do(a) " +this.getNacionalidade());
        System.out.println("Lutando pela categoria " +this.getCategoria());
        System.out.println("Tem " +this.getIdade() +" anos");
        System.out.println("Com peso de " + this.getPeso() +"Kg");
        System.out.println("Com " + this.getAltura() + "m de altura");
        System.out.println(this.getVitoria()+" Vitorias, "+this.getDerrota()+" Derrotas e "+this.getEmpate()+" Empates");
        System.out.println("=======================================");
    }
    
    public void status(){
        System.out.println("===================================");
        System.out.println(this.getNome());
        System.out.println("da categoria "+ this.getCategoria());
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }
    
}
