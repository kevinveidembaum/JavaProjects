package reader;

import java.util.Random;

public class Book implements BookInterface{
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Person leitor;

    public Book(String titulo, String autor, int totPag, Person leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.setAberto(false);
        this.setPagAtual(1);
    }
    
    public void detalhes(){
        if(this.isAberto()){
            System.out.println("=============================");
            System.out.println("Titulo: " +this.getTitulo());
            System.out.println("Autor: " +this.getAutor());
            System.out.println("Total de paginas: " +this.getTotPag());
            System.out.println("Pagina Atual: " +this.getPagAtual());
            System.out.println("Aberto: " +this.isAberto());
            System.out.println("Leitor: " + this.leitor.getNome());
        }else {
            System.out.println("Livro fechado");
        }
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Person getLeitor() {
        return leitor;
    }

    public void setLeitor(Person leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        Random pagina = new Random();
        int pagAleatoria = pagina.nextInt(this.getTotPag());
        this.setPagAtual(pagAleatoria);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }
    
}
