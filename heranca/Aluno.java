
public class Aluno extends Pessoa{

    public Aluno(String nome, String cpf, String profissao){
        
        // Indica que o construtor eh o mesmo da class pai
        super( nome, cpf, profissao);
        
        // Se eu nao defino o super java chama implicitamente a funcao da classe pai 
        setProfissao("aluno");
    }
    public Aluno(String nome, String cpf){
        super( nome, cpf );
        super.setProfissao("aluno");
    }
    
    // Sobrescreve o metodo
    public void howIam(){
        System.out.println("Estudante");
    }
    //public Aluno(String nome){
    //    setNome(nome);
    //}
    // se o construtor vazio Aluno for defindo apenas na classe Aluno ocorrera o seguinte erro
    //./Aluno.java:15: error: no suitable constructor found for Pessoa(no arguments)
    //public Aluno(){}
}