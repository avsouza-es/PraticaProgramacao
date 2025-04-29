public class PerfectNumberExample {
    public static void main(String[] args) {
        int number = 28; // Você pode mudar este valor para verificar outro número
        int sum = 0;
        int i = 1;
        do {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        } while (i < number);
        
        if (sum == number) {
            System.out.println(number + " é um número perfeito.");
        } else {
            System.out.println(number + " não é um número perfeito.");
        }
    }
}
