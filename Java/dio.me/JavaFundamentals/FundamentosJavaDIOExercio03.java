/*
 Autor: Alexandre
 Data: 20250408
 Enunciado: Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela.
            fórmula: área = base x altura
*/

import java.util.*;

public class FundamentosJavaDIOExercio03 {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      int base, altura;
      int area;
      
      System.out.print("Digite a altura do retângulo: ");
      base = leia.nextInt();
      System.out.print("Digite a base do retângulo: ");
      altura = leia.nextInt();
      
      area = base * altura;
      
      System.out.println("O Tamanho do retângulo é: " + area);
  }
}