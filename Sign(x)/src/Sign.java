import java.util.Scanner;
public class Sign {
	public static void main (String[]args) {
	int x;
	int y;
	java.util.Scanner in = new Scanner(System.in);
	System.out.print("Ведите значение X:");
	x = in.nextInt();
	in.close();
	if (x > 0) {
		y = 1;
		System.out.println("Sign(x) = " + y);
	}
	else if (x < 0) {
		y = -1;
		System.out.println("Sign(x) = " + y);
	}	
	else {
	y = 0;
	System.out.println("Sign(x) = " + y);
	}
	}
}
