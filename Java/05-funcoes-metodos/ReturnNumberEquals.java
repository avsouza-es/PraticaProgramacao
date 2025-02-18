import java.util.Scanner;

public class ReturnNumberEquals {
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite um numero: ");
	    int numero1 = scanner.nextInt();
	    
	    System.out.print("Digite um numero: ");
	    int numero2 = scanner.nextInt();
	    
	    System.out.println();
	    System.out.print(isEqual(numero1, numero2));
	    
	    scanner.close();
	}	    
	
	public static boolean isEqual(int num1, int num2) {
		if (num1 == num2) {
			return true;
		} else {
			return false;
		}    
	}
	
}