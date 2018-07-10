import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value X:");
		int x = scanner.nextInt();

		System.out.println("Enter value Y:");
		int y = scanner.nextInt();

		System.out.println("Enter value Y:");
		int z = scanner.nextInt();

		int sum = 0;

		if (x == y && x != z && y != z) {
			sum = z;
			System.out.println(sum);
		} else {
			if (x == z && x != y && z != y) {
				sum = y;
				System.out.println(sum);
			} else {

				if (y == z && y != x && z != x) {
					sum = x;
					System.out.println(sum);
				} else {
					if (x == y && y == z) {
						sum = 0;
						System.out.println("Visi vienadi");
					} else {
						sum = x + y + z;
						System.out.println(sum);
					}
				}
			}
		}

	}
}
