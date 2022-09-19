import java.util.Scanner;

public class baseng 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double rata = (a + b + c) / 3;

		System.out.println("Rata = " + rata);

		if (rata >= 60) {
			System.out.println(":)");
		}
		else {
			System.out.println(":(");
		}
	}
}