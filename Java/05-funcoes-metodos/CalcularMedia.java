public class CalcularMedia {
    public static void main(String[] args) {
        double media = calcularMedia(7, 9);
        System.out.println("A média é: " + media);
    }

    public static double calcularMedia(int num1, int num2) {
        return  (num1 + num2) / 2;
    }
}
