import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);

		double fnum, snum, ans;

		System.out.println("Enter first number: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second number: ");
		snum = bucky.nextDouble();

		ans = fnum + snum;
		
		System.out.println(ans);

	}

}
