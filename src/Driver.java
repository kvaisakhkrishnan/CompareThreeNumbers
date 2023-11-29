import java.util.*;
public class Driver {
	public static void main(String args[]) {
		System.out.println("Enter three numbers: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		Numbers<Integer> numbers = new Numbers<>(x, y, z);
		System.out.println(numbers.compareThree());
	}
}
