import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// java.util.Scanner sc; - bez import
		
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter value X:");
		int x = sc1.nextInt();
	
		System.out.println("Enter value Y:");
		int y = sc1.nextInt();
		
		int sum = x + y;
		System.out.println("Sum: " + sum);
	}

}
