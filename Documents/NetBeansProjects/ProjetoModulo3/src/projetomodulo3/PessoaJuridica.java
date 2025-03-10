/**
 * herança
 */
package projetomodulo3;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeFantacia;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, int anoNascimento, String cnpj, String nomeFantacia) {
        super(nome,anoNascimento);
        this.cnpj = cnpj;
        this.nomeFantacia = nomeFantacia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantacia() {
        return nomeFantacia;
    }

    public void setNomeFantacia(String nomeFantacia) {
        this.nomeFantacia = nomeFantacia;
    }
    
    @Override
    public void mostrarDados(){
        System.out.println("sou o primeiro filho");
        super.mostrarDados();
        

}
}




