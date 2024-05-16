package ultimatecombat;

import java.util.Random;

public class Fight {
    private Fighter desafiado;
    private Fighter desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Fighter lut1, Fighter lut2){
        if(lut1.getCategoria().equals(lut2.getCategoria()) && lut1 != lut2){
            this.aprovado = true;
            this.desafiante = lut1;
            this.desafiado = lut2;
        } else {
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    public void lutar(int rounds){
        if(this.isAprovado()){
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            Random aleatorio = new Random();
            int totalPontos = 0;
            for(int i = 0; i <= rounds; i++){
                totalPontos += aleatorio.nextInt(11);
            }
            totalPontos /= rounds;
            
            if(totalPontos < 3){
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }else if(totalPontos < 6){
                System.out.println("O Desafiante "+ this.desafiante.getNome()+ " Ganhou!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            }else{
                System.out.println("O Desafiado "+ this.desafiado.getNome()+ " Ganhou!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            }
            
        }else{
            System.out.println("A luta nao pode acontecer!");
        }
    }
    
    
    public Fighter getDesafiado(){
        return desafiado;
    }
    
    public void setDesafiado(Fighter desafiado){
        this.desafiado = desafiado;
    }
    
    public Fighter getDesafiante(){
        return desafiante;
    }
    
    public void setDesanfiante(Fighter desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
