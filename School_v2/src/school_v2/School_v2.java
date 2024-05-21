package school_v2;

public class School_v2 {

    public static void main(String[] args) {
        Visitor v = new Visitor();
        v.setNome("Juscelino");
        v.setIdade(63);
        v.setSexo("M");
        System.out.println(v.toString());
        
        Student a = new Student();
        a.setNome("Enzo");
        a.setIdade(13);
        a.setSexo("M");
        a.setCurso("Agile Couch");
        a.setMatricula(23345);
        System.out.println(a.toString());
        a.pagarMensalidade();
        
        Fellow b = new Fellow();
        b.setNome("Lorena");
        b.setIdade(17);
        b.setSexo("F");
        b.setCurso("Fortune Tiger Pro Player");
        b.setMatricula(6534);
        b.renovarBolsa();
        System.out.println(b.toString());
        b.pagarMensalidade();
        
        Worker c = new Worker();
        c.setNome("Fione");
        c.setIdade(37);
        c.setSexo("F");
        c.setCurso("BodyBuilder");
        c.setMatricula(532452);
        c.setRegistroProfissional(345765);
        c.praticar();
        System.out.println(c.toString());
        c.pagarMensalidade();
        
        Professor f = new Professor();
        f.setNome("Juil");
        f.setIdade(56);
        f.setSexo("M");
        f.setEspecialidade("Algebra linear");
        f.receberAumento(23445);
        System.out.println(v.toString());
        
        
        
    }
    
}
