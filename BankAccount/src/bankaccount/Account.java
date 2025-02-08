package bankaccount;

public class Account {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("==============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.isStatus());
    }
    
    public Account(){
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo.equals("CC")){
            this.setSaldo(50);
        }else if("CP".equals(tipo)){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso!");
    }
    
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Retire o dinheiro da conta!");
        } else if(saldo < 0){
            System.out.println("Endividado, impossibilitado de fechar conta!");
        }else{
            this.setStatus(false);
            System.out.println("Conta Fechada com Sucesso!");
        }
        
    }
    
    
    public void depositar(float deposito){
        if(isStatus()){
            setSaldo(getSaldo() + deposito);
            System.out.println("Transacao feita com sucesso!");
            System.out.println("Obrigado "+ this.getDono());
        }else{
            System.out.println("Impossivel depositar, conta fechada");
        }
        
    }
    
    public void sacar(float saque){
        if(isStatus()){
            if(getSaldo() >= saque){
                setSaldo(getSaldo() - saque);
                System.out.println("Saldo realizado, obrigado " + getDono());
            } else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar, conta fechada");
        }
    }
    
    public void pagarMensal(){
        float mensalidade = 0;
        if("CC".equals(getTipo())){
            mensalidade = 12;
        }else if("CP".equals(getTipo())){
            mensalidade = 20;
        }
        
        if(isStatus()){
            if(getSaldo() > mensalidade){
                setSaldo(getSaldo() - mensalidade);
            } else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossivel cobrar mensalidade, conta fechada");
        }
        
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
