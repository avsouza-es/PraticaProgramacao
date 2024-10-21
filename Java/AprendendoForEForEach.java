import java .util.*;

public class AprendendoForEForEach{
  public static void main(String[] args){
    // For basico
    System.out.println("Exemplo 01");
    for (int i=0; i<10; i++)    {
        System.out.println("Contando: " + i);
    }
    // usando for para serializacao de produto
    int quantidadeProdutos = 3;
    System.out.println();
    System.out.println("Exemplo 02");
    for (int i = 1; i <= quantidadeProdutos; i++) {
        System.out.println("Produto: " + i + ", Nome do Produto: " + i + ", preco: R$10.00 ");
    }
    // calcular fatorial de um numero
    // Definicao: Em matematica, o fatorial de um numero inteiro positivo n, denotado por n!, e o produto de todos os inteiros positivos menores ou iguais a n.
    int N = 5;
    int fatorial = 1;
    System.out.println("\nExemplo 03");
    for(int i = 1; i <= N; i++){
        fatorial *= i;
    }
    System.out.println("O fatorial de " + N + " e: " + fatorial);
    
    // Imprimir numeros pares
    int limite = 20;
    System.out.println("\nExemplo 04");
    for(int i = 2; i <= limite; i +=2 ){
        System.out.println(i);
    }
    
    // Contagrem regressiva
    System.out.println("\nExemplo 05 - Contagem regressiva");
    for(int i = 10; i>=1; i--){
        System.out.println(i);
    }
    System.out.println("Feliz ano novo.");
  }
}