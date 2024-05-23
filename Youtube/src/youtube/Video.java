package youtube;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    @Override
    public void play() {
        if(reproduzindo){
            System.out.println("Reproduzindo video");
        }else{
            this.reproduzindo = true;
            System.out.println("Apertou o play");
        }
    }

    @Override
    public void pause() {
        if(reproduzindo){
            this.reproduzindo = false;
            System.out.println("Apertou pause");
        }else{
            System.out.println("Video pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
        System.out.println("Deu like");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", avaliacao=" + avaliacao + ", \nviews=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo;
    }
    
    
    
}
