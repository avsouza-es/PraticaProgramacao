import java.util.Scanner;

class OperadoresEmJava 
{
	public static void main(String[] args)
	{
		var scanner = new Scanner(System.in);
		System.out.print("Quantos anos você tem: ");
		var age = scanner.nextInt();
		System.out.print("Você é emancipado? ");
		var isEmancipated = scanner.nextBoolean();
		var canDrive = age >= 18 || isEmancipated;
		System.out.println("Você pode dirigir? " + canDrive);
		scanner.close();
	}
}