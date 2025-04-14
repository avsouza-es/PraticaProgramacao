/*

 Básico
 Princípios Básicos
Descrição
Escreva um programa que receba dois números inteiros e exiba a soma, subtração, multiplicação, divisão inteira e o resto da divisão entre eles.

Entrada
A entrada deve receber dois números inteiros separados por espaço.

Saída
Deverá retornar os resultados das operações aritméticas solicitadas em linhas separadas, na seguinte ordem: soma, subtração, multiplicação, divisão inteira, e resto da divisão.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada Saída
10 2  12
8
20
5
0
15 4  19
11
60
3
3
7 3 10
4
21
2
1

*/


import java.util.Scanner;

public class  DesafioPrinciosBasicos02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        //TODO: Implemente as operações solicitadas na descrição  e exibir o resultado
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a % b);
        
        scanner.close();
    }
}