public class Professor extends Pessoa{
    private String registro;
    
    public Professor(String nome, String cpf, String profissao, String registro)
    {
        // se o super n eh usado, seus valores nome, cpf e profissao, sera nulo na criacao do objeto
        super(nome, cpf, profissao); 
        setRegistro(registro);
    }
    
    public void setRegistro(String registro){
        this.registro = registro;
    }
    public String getRegistro(){
        return this.registro;
    }
    //Reaproveita o methodo da classe pai e complementa
    public void howIam(){
        super.howIam();
        System.out.println("Professor");
    }
}