import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		int hours = 24; 
		int minutes = 60; 
		int seconds = 60;

		System.out.println(days * hours * minutes * seconds);
		
	}
}
