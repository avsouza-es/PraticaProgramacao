import java.util.*;

public class ProgramaFive {
    public static void main(String[] args) {
      
      int a = 5;
      int b = 3;
      
      int soma = a+b;
      double multiplicar = a*b;
      double dividir = a/b;
      int subtrair = a-b;
      
      System.out.println(soma);
      System.out.println(multiplicar);
      System.out.println(dividir);
      System.out.println(subtrair);
      
      System.out.println();
      System.out.println("Soman de A+B=" + (a+b));
      System.out.println("Soman de A*B=" + (a*b));
      System.out.println("Soman de A/B=" + (a/b));
      System.out.println("Soman de A+B=" + (a-b));
      
      // Trabalhando com operadores lógicos
      System.out.println();
      System.out.println(a+b);
      System.out.println(a>b);
      System.out.println(a<b);
      System.out.println(a!=b);
      
      System.out.println();
      System.out.println((a > b) && (a < b));
      System.out.println((a == b) && (a < b));
      System.out.println((a == b) && (a > b));
      System.out.println((a != b) && (a < b));
      
      System.out.println();
      System.out.println((a > b) || (a < b));
      System.out.println((a == b) || (a < b));
      System.out.println((a == b) || (a > b));
      System.out.println((a != b) || (a < b));

  }
}