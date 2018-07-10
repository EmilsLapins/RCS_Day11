import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value X:");
		int x = scanner.nextInt();

		System.out.println("Enter value Y:");
		int y = scanner.nextInt();

		int sum = x + y;

		if (sum >= 10 && sum <= 19) {
			System.out.println(20);

		} else {
			System.out.println(sum);
		}

	}

}
