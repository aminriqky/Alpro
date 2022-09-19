import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lima
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
			int x, y, z;
			
			System.out.println(" ");
			System.out.println("PROGRAM SEGITIGA SOLUSI BILANGAN ALJABAR");
			System.out.println(" ");
			
			for (x = 0; x <= 25; x++)
			{
				for (y = 0; y <= 25; y++)
				{
					for (z = 0; z <= 25; z++)
					{
						if ( x+y+z == 25)
							System.out.println("Solusi Persamaannya Adalah = " + x + " + " + y + " + " + z); 
					}
					
				}
					
			}
			
		
	}
}