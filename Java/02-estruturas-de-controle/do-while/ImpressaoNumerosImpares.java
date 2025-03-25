public class ImpressaoNumerosImpares {
    public static void main(String[] args) {
        int contador = 0;
        
        while (contador <= 20) {
            if ((contador % 2) != 0) {
                System.out.println("Número é ímpar: " + contador);
            }
        contador++;
        }
    }
}
