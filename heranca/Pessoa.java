public class Pessoa{
    
    private String nome;
    private String cpf;
    private String profissao;
    
    public void howIam(){
        System.out.println("Eu sou Pessoa: ");
    }
    
    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    public Pessoa(String nome, String cpf, String profissao){
        setNome(nome);
        setCpf(cpf);
        setProfissao(profissao);
    }
    
    public void setCpf( String cpf ){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public String getProfissao(){
        return this.profissao;
    }
}

