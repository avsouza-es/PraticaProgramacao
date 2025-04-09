/*
 Autor: Alexandre
 Data: 20250408
 Enunciado: Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Nome' você tem 'X' anos."
*/

import java.util.*;

public class FundamentosJavaDIOExercio01 {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      String nome;
      int idade;
      
      System.out.print("Digite seu nome: ");
      nome = leia.next();
      System.out.print("Digite sua idade: ");
      idade = leia.nextInt();
      
      System.out.println("Olá " + nome + " você tem " + idade + " anos.");
  }
}