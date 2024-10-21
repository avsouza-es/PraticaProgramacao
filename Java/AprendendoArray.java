import java.util.*;

public class AprendendoArray {
    
    public static void main(String[] args){
        int[] numeros = new int[5];
        
        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 7;
        numeros[3] = 33;
        numeros[4] = 18;
        
        System.out.println("\nExemplo 01 - Apresentando o array manualmente");
        System.out.println("Numero do array no indice 2: " + numeros[2]);
        
        // usando for para apresentar todo o array
        System.out.println("\nExemplo 02 - Apresentando o Array com for");
        for(int i = 0; i <=4; i++){
            System.out.println(numeros[i]);
        }
        
        // inicializacao direta de um array
        int[] numeros1 = {1,2,3,4,5};
        // mostra numeros do array
        System.out.println("Exemplo 03 - Nivel FACIL - Iniciando array diretamente");
        for(int i = 0; i <= 4; i++){
            System.out.println("\033[32mOs Numeros do array e: " + numeros1[i]);
        }
        
    }
}