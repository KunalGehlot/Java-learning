import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();

		System.out.println("Enter name of yor first gf here: ");
		String temp = input.nextLine();
		
		tunaObject.setName(temp);
		tunaObject.saying();
	}

}
