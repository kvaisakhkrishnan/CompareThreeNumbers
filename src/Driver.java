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
		System.out.println("Enter three float numbers: ");
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		Numbers<Float> floatNumbers = new Numbers<>(a, b, c);
		System.out.println(floatNumbers.compareThree());
	}
}
