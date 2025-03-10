package projetomodulo3;

public class Pessoa {

    private String nome;
    private int anoNascimento;
    
    public Pessoa() {
        
    }

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    } 
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + (2025 - anoNascimento));
    }
        
}
