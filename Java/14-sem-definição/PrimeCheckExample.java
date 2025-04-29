public class PrimeCheckExample {
    public static void main(String[] args) {
        int number = 29; // Você pode mudar este valor para verificar outro número
        boolean isPrime = true;
        int i = 2;
        do {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        } while (i <= number / 2);
        
        if (isPrime) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}
