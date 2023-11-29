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
		System.out.println("Enter three strings: ");
		String s1 = scanner.next();
		String s2 = scanner.next();
		String s3 = scanner.next();
		Numbers<String> stringItems = new Numbers<>(s1, s2, s3);
		System.out.println(stringItems.compareThree());
	}
}
