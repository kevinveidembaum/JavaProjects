package school;

public class School {

    public static void main(String[] args) {
        Person pessoa = new Person();
        Student aluno = new Student();
        Professor prof = new Professor();
        Employee func = new Employee();
        
        pessoa.setNome("Edemail");
        pessoa.setIdade(36);
        pessoa.setSexo("MACHO");
        
        aluno.setNome("Joaozinho");
        pessoa.setIdade(6);
        pessoa.setSexo("MACHO");
        aluno.setCurso("Admin");
        aluno.setMatriculado(true);
        aluno.cancelarMatr();
        
        prof.setNome("Julio");
        prof.setIdade(56);
        prof.setSexo("MACHO");
        prof.setEspecialidade("Filosofar");
        prof.setSalario(1200);
        prof.receberAumento(7000);
        
        func.setNome("Xuliana");
        func.setIdade(109);
        func.setSexo("FEMEA");
        func.setSetor("Financeiro");
        func.setTrabalhando(true);
        func.mudarTrabalho();
        
        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(prof.toString());
        System.out.println(func.toString());
        
    }
    
}
