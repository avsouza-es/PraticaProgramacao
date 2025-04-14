/*

 Básico
 Princípios Básicos
Descrição
Implemente um programa que receba a nota de um estudante (de 0 a 10) e informe se ele foi "Reprovado" (nota < 5), está em "Recuperação" (nota entre 5 e 6.9), ou foi "Aprovado" (nota ≥ 7).

Entrada
A entrada deve receber um número decimal representando a nota do estudante.

Saída
Deverá retornar uma mensagem indicando o status do estudante: "Reprovado", "Recuperacao" ou "Aprovado".

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada Saída
4.5 Reprovado
5.5 Recuperacao
7.0 Aprovado


*/


import java.util.Scanner;

public class  DesafioPrinciosBasicos03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();
        
        //TODO: Implemente a estrutura condicional para verificar a classificação da nota:

        if (nota < 5) {
          System.out.println("Reprovado");
        } else if ((nota >= 5 ) && (nota <= 6.9)) {
          System.out.println("Recuperação");
        }  else {
          System.out.println("Aprovado");
        }

        scanner.close();
    }
}