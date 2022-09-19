import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Segitiga
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int a, b, c, a1, b1, c1;
		
		String aa = "";
		String bb = "";
		String cc = "";
		
		System.out.print("Masukkan Sudut A = ");
		try
		{
			aa = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Masukkan Sudut B = ");
		try
		{
			bb = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Masukkan Sudut C = ");
		try
		{
			cc = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		a = Integer.parseInt(aa);
		b = Integer.parseInt(bb);
		c = Integer.parseInt(cc);
		
		if ((a == 90) && (b == 90) && (c == 90)) 
		{
			System.out.println("Ini adalah segitiga Siku Sikku");
		}
		else if ((a == 60) && (b == 60) && (c == 60))
		{	
			System.out.println("");
		} 
		else
		{
			System.out.println("HUU Olo :v");
		}

	}
}