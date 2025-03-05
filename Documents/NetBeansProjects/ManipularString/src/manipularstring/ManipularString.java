
package manipularstring;

import java.util.Scanner;

public class ManipularString {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Palavra metodo = new Palavra();
        
        System.out.print("Digite uma palavra: ");
        metodo.setPalavra(ler.nextLine());
        
        System.out.println(metodo.classificarTamanho());
        System.out.println("á " + metodo.numeroLetras()+ " letras nesta palavra");
        
       
    }
    
}
