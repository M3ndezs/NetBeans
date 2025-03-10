package projetomodulo3;

public class ProjetoModulo3 {
     
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Papai", 1970);
        System.out.println("sou o PAI de todos");
        pessoa.mostrarDados();
        
        Pessoa pj = new PessoaJuridica("Astolfo hiller", 2000, "12345", "Bernardo");
        pj.mostrarDados();
        
        Pessoa pf = new PessoaFisica("Mini Stalin", 2008, "12345678900");
        pf.mostrarDados();
    }
}
