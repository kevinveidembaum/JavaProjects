package youtube;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
        this.experiencia++;
        System.out.println("Viu mais um video");
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + ", \nlogin=" + login + ", totAssistido=" + totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
