public class DetermineValorMin4Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        int d = 10;
        int menor = 0;

        if (( a < b) && (a < c ) && (a < d)) {
            menor = a;
        } else if ((b < a) && (a < c) && (b < d)) {
            menor = b;
        } else if ((c < a) && (c < b) && (c < d)) {
            menor = c;
        } else {
            menor = d;
        }

        System.out.println("O menor numero é: " + menor);    

    }
}

 