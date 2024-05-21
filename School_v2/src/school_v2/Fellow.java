package school_v2;

public class Fellow extends Student{
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de "+ this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno "+this.nome+" e bolsista");
        System.out.println("Desconto realizado com sucesso!");
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
