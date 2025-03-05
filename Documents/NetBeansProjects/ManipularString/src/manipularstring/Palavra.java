
package manipularstring;

public class Palavra {
    private String palavra;
    private int tamanho;
        

    public String classificarTamanho(){
         tamanho = palavra.length();
        
        if (tamanho % 2 == 0) {
            return "A palavra tem um número de letras PAR.";
        } else {
            return "A palavra tem um número de letras ÍMPAR.";
        }
    }
    
    public int numeroLetras(){
        return tamanho = palavra.length();
    }
    
    public void setPalavra (String palavra){
        this.palavra = palavra;
    }
}


