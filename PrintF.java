import java.util.Scanner;

public class PrintF {
	public static void main(String[] args) {
		int age;
		String name, plural;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = keyboard.next();

		System.out.print("Enter you age: ");
		age = keyboard.nextInt();

		if (age == 1) {
			plural = "year";
		} else {
			plural = "years";
		}

		keyboard.close();
		
		System.out.printf("%s is %d %s old\n",name, age, plural);

	}
}
