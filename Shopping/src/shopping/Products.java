package shopping;

public class Products {
    private int quantTotal;
    private String descricao;
    private float precoUni;
    private Clients cliente;

    public Products(int quantTotal, String descricao, float precoUni) {
        this.quantTotal = quantTotal;
        this.descricao = descricao;
        this.precoUni = precoUni;
    }
    
    public void comprar(Clients cliente, int quantComprar){
        float valorTot = this.getPrecoUni() * quantComprar;
        if (cliente.getDinheiro() >= valorTot) {
            this.setQuantTotal(this.getQuantTotal() - quantComprar);
            cliente.setDinheiro(cliente.getDinheiro() - valorTot);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Impossibilitado de comprar!");
        }
    }
    
    
    @Override
    public String toString() {
        return "quantidade = " + quantTotal + ", descricao = " + descricao + ", preco = R$" + precoUni;
    }
    

    public Clients getCliente() {
        return cliente;
    }

    public void setCliente(Clients cliente) {
        this.cliente = cliente;
    }

    public int getQuantTotal() {
        return quantTotal;
    }

    public void setQuantTotal(int quantTotal) {
        this.quantTotal = quantTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoUni() {
        return precoUni;
    }

    public void setPrecoUni(float precoUni) {
        this.precoUni = precoUni;
    }
    
}
