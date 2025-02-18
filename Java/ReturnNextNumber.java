import java.util.Scanner;

public class ReturnNextNumber {
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite um numero: ");
	    int numero = scanner.nextInt();
	    
	    System.out.println();
	    System.out.println(addition(numero));
	}	    
	
	public static int addition(int num)    {
	    return num+1;   
	}
	
}