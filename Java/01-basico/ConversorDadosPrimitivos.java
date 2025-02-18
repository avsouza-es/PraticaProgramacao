import java.util.*;

public class ConversorDadosPrimitivos {
    public static void main(String[] args) {
      
      //conversão implícita
      int i = 10;
      float f = i; // Conversão implícita
      System.out.println(f); // Saída: 10.0
      
      char c = 'A';
      int x = c; // Conversão implícita
      System.out.println(x); // Saída: 65 (valor ASCII do caractere 'A')
      
      //conversão explícita
      double d = 10.5;
      int y = (int) d;
      System.out.println(y);
      
      int k = 65;
      char m = (char) k;
      System.out.println(m);
  }
}