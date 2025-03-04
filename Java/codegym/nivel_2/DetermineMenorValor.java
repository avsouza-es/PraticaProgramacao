public class DetermineMenorValor {
    public static void main(String[] args) {
        int a = 5, b = 2;
        int c = a, d = b;

        int m2;

        if (c <d) {
            m2 = c;
        } else {
            m2 = d;
        }

        int m = m2;
        System.out.println("The minimum is " + m);
    }
}
