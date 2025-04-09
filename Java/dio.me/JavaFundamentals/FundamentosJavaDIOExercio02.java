/*
 Autor: Alexandre
 Data: 20250408
 Enunciado: Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
            fórmula: área = lado x lado
*/

import java.util.*;

public class FundamentosJavaDIOExercio02 {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      int lado;
      
      System.out.print("Digite o tamando do lado do quadrado: ");
      lado = leia.nextInt();
      
      int area = lado * lado;

      System.out.println("O tamanho do quadrado e de " + area + " m².");
  }
}