import java.util.*;

public class TabuadaSimples {
    public static void main(String[] args) {
      
      int numero = 10;
      int divisor = 2;
      int resultado;
      int contador = 0;
      while (contador <= 20) {
        resultado = contador % 2;
        if (resultado == 0) {
          System.out.println("Número " + contador + " é par.");
        } else {
          System.out.println("Número " + contador + " é ímpar.");
        }
        contador++;
      }
  }
}