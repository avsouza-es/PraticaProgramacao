/*
 Autor: Alexandre
 Data: 20250408
 Enunciado: Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
            
*/

import java.util.*;

public class FundamentosJavaDIOExercio04 {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      int diferenca, idadePessaA, idadePessoaB;
      
      System.out.print("Digite a idade da Pessoa A: ");
      idadePessaA = leia.nextInt();
      System.out.print("Digite a idade da Pessoa B: ");
      idadePessoaB = leia.nextInt();
      
      diferenca = idadePessaA - idadePessoaB;
      
      System.out.println("A Pessoa A tem " + idadePessaA + " anos. E a Pessoa B tem " + idadePessoaB + " anos. A diferença de idade e de " + diferenca + " anos.");
  }
}