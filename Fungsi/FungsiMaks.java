import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FungsiMaks
{
	static int Maks(int a, int b)
	{
		if (a >= b )
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		int a, b;
		
		String A = "";
		String B = "";
		
		System.out.print("Inputkan Nilai A = ");
		
		try 
		{
			A = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		a = Integer.parseInt(A);
		
		System.out.print("Inputkan Nilai B = ");
		
		try
		{
			B = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		b = Integer.parseInt(B);
		
		System.out.println("Nilai Terbesar = " + Maks(a, b));
	}
}