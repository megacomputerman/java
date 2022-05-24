
//import Pessoa;

public class Test{
    public static void main(String[] args){
        //testAluno();
        testProf();
    }
    
    public static void testAluno(){
        Pessoa pessoa = new Pessoa("wall", "1234");
        System.out.println(pessoa.getNome() + " " + pessoa.getCpf());
        
        Pessoa aluno = new Aluno("bruno", "432");
        Pessoa aluno2 = new Aluno("miranda", "432", "eng");
        System.out.println(aluno.getNome() + " " + aluno.getCpf() + " " + aluno.getProfissao());
        System.out.println(aluno2.getNome() + " " + aluno2.getCpf() + " " + aluno2.getProfissao());
        
        Aluno aluno3 = new Aluno("vivi", "432", "eng");
        System.out.println(aluno3.getNome() + " " + aluno3.getCpf() + " " + aluno3.getProfissao());
        
        aluno3 = new Aluno("libman", "432");
        System.out.println(aluno3.getNome() + " " + aluno3.getCpf() + " " + aluno3.getProfissao());
        
        //aluno3 = new Aluno("eu"); o
        //System.out.println(aluno3.getNome() + " " + aluno3.getCpf() + " " + aluno3.getProfissao());
        
        //pessoa = new Pessoa();
        System.out.println(pessoa.getNome() + " " + pessoa.getCpf());
    }
    
    public static void testProf()
    {
        //Pessoa prof = new Professor();
        //error construtor n foi defindo na classe Construtor
        //prof = new Professor("Teslta", "22");
        //error construtor n foi defindo na classe Construtor
        //Professor prof2 = new Professor("Teslta", "22");
        Professor prof2 = new Professor("Teslta", "22", "prof", "adb33" );
        Pessoa prof = new Professor("Teslta", "22", "prof", "adb33" );
        
        System.out.println(prof2.getNome() + " " + prof2.getCpf() + " " + prof2.getProfissao());
        System.out.println(prof.getNome() + " " + prof.getCpf() + " " + prof.getProfissao());
        
        Pessoa pessoa = new Pessoa("wall", "1234");
        Pessoa aluno2 = new Aluno("miranda", "432", "eng");
        pessoa.howIam();
        prof.howIam();
        aluno2.howIam();
        
    }
}