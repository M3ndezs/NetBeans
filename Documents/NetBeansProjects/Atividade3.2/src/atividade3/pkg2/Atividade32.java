
package atividade3.pkg2;

import java.util.Scanner;

public class Atividade32 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();
        System.out.println("Informe sua altura: ");
        double altura = ler.nextDouble();
        
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        
        pessoa.mostrar();
        
        if (pessoa.eMaiorIdade()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }
        
        System.out.println("Faltam " + pessoa.anosParaCem() + " anos para atingir 100 anos.");
    
    ler.close();

    }
    
}
