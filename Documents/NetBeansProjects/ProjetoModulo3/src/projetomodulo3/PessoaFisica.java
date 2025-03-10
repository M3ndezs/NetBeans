
package projetomodulo3;

public class PessoaFisica extends Pessoa {
private String cpf;
    
    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, int anoNascimento, String cpf) {
        super(nome, anoNascimento);
        this.cpf = cpf;
    }
    
@Override
    public void mostrarDados(){
        System.out.println("sou o segundo filho");
        super.mostrarDados();
    }
    
}
