import java.util.Scanner;

public class PrintF {
	public static void main(String[] args) {
		int age;
		String name, plural;
		char mi;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = keyboard.next();

		System.out.print("Enter your middle initial: ");
		mi = keyboard.next().charAt(0);

		System.out.print("Enter you age: ");
		age = keyboard.nextInt();

		plural = (age == 1) ? "year" : "years";

		keyboard.close();
		
		System.out.printf("%s %c is %d %s old\n",name, mi, age, plural);

	}
}
