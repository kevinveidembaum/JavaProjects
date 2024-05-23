package youtube;

public class Youtube {

    public static void main(String[] args) {
        Video[] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[2];
        Visualizacao[] visu = new Visualizacao[5];
        
        v[0] = new Video("Canal do Samuca");
        v[1] = new Video("Curso em Video");
        v[2] = new Video("Jovem Tranquilao");
        g[0] = new Gafanhoto("Jerson", "M", 17, "JerGameplays");
        g[1] = new Gafanhoto("Mirela", "F", 14, "MariHD");
        visu[0] = new Visualizacao(g[0], v[0]);
        visu[1] = new Visualizacao(g[0], v[1]);
        visu[2] = new Visualizacao(g[1], v[0]);
        visu[3] = new Visualizacao(g[0], v[2]);
        visu[4] = new Visualizacao(g[1], v[2]);
        visu[0].avaliar();
        visu[1].avaliar(8);
        visu[2].avaliar(50f);
        visu[3].avaliar(64f);
        visu[4].avaliar(3);
        
        
        System.out.println("\nVideos\n------------------------");
        for(Video v1:v){
            System.out.println(v1.toString());
        }
        System.out.println("\nGafanhotos\n--------------------");
        for(Gafanhoto g1:g){
            System.out.println(g1.toString());
        }
        System.out.println("\nVisualizacaoes\n--------------------");
        for(Visualizacao vis:visu){
            System.out.println(vis.toString());
        }
        
        
        
    }
    
}
