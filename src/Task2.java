import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value X:");
		int x = scanner.nextInt();

		System.out.println("Enter value Y:");
		int y = scanner.nextInt();

		System.out.println("Enter value Z:");
		int z = scanner.nextInt();

		int sum = x + y + z;
		double avg = sum / 3.0;
		// VAI ARI
		// double avg = sum / (double) 3;

		System.out.println("Average: " + avg);

	}

}