import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rupiah
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int a, b, c, d, e, detik, Sisa1, Sisa2, Sisa3, Sisa4, Sisa5;
		String X1 = "";
		
		System.out.print("Total Rupiah = ");
		try
		{
			X1 = dataIn.readLine();
		}
		catch ( Exception h )
		{
			System.out.println("Error!");
		}
		
		
		detik = Integer.parseInt(X1);
		a = detik / 1000;
		Sisa1 = detik % 1000;
		b = Sisa1 / 500;
		Sisa2 = detik % 500;
		c = Sisa2 / 100;
		Sisa3 = detik % 100;
		d = Sisa3 / 50;
		Sisa4 = detik % 25;
		e = Sisa4 / 25;
		Sisa5 = detik % 25;
		
		System.out.print("Setara Dengan = " + "Rp. 1000 " + "(" + a + " Buah " + ")");
		System.out.print("Ditambah Dengan = " + "Rp. 500 " + "(" + b + " Buah " + ")");
		System.out.print("Ditambah Dengan = " + "Rp. 100 " + "(" + c + " Buah " + ")");
		System.out.print("Ditambah Dengan = " + "Rp. 50 " + "(" + d + " Buah " + ")");
		System.out.print("Ditambah Dengan = " + "Rp. 25 " + "(" + e + " Buah " + ")");
		System.out.print("Ditambah Dengan = " + "Rp. " + Sisa5);
	}
}