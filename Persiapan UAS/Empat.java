import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Empat
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		try
		{
			int t, y, x;
			
			String ting;
			
			System.out.println(" ");
			System.out.println("PROGRAM SEGITIGA PASCAL");
			System.out.println(" ");
			
			System.out.print("Masukkan Panjang Alas Segitiga = ");
			ting = dataIn.readLine();
			
			t = Integer.parseInt(ting);
			
			for (x = 1; x <= t; x++)
			{
				for (y = 1; y <= x; y++)
				{
					
					System.out.print("*");
				}
					System.out.println();
				
			}
			
			for (x = 1; x <= t; x++)
			{
				for (y = t-1; y >= x; y--)
				{
					
					System.out.print("*");
				}
					System.out.println();
				
			}
			
			
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
	}
}