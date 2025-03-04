public class DetermineValorMin3Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 2;

        int menor = 0;

        if (( a < b) && (a < c )) {
            menor = a;
        } else if ((b < a) && (a < c)) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("O menor numero é: " + menor);
    }
}
