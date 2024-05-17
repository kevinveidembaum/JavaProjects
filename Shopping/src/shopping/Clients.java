package shopping;

public class Clients {
    private String cliente;
    private float dinheiro;
    
    public Clients(String nome, float dinheiro){
        this.cliente = nome;
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "cliente = " + cliente + ", dinheiro = R$" + dinheiro;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public float getDinheiro(){
        return dinheiro;
    }
    
    public void setDinheiro(float dinheiro){
        this.dinheiro = dinheiro;
    }
    
}
