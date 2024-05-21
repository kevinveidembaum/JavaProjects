package school_v2;

public class Worker extends Student{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println(this.nome + " esta praticando!");
    }
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
