package youtube;

public class Visualizacao {
    private Video filme;
    private Gafanhoto espectador;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.filme = filme;
        this.espectador = espectador;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        this.filme.setReproduzindo(true);
        this.espectador.setExperiencia(this.espectador.getExperiencia() + 0.8f);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot;
        if(porc <= 30){
            tot = 3;
        }else if(porc <= 6){
            tot = 6;
        }else if(porc <= 8){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme;
    }
}
