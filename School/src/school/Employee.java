package school;

public class Employee extends Person{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        //this.trabalhando = !this.trabalhando;
        if (isTrabalhando()) {
            this.setTrabalhando(false);
            System.out.println("Descanse!");
        } else {
            this.setTrabalhando(true);
            System.out.println("Trabalhe!!");
        }
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
}
