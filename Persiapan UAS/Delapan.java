import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Delapan 
{
	public static void main(String[] args)
		{
			BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
			try
			{
			int a, b, c, i, hasil;
			
			String cc;
			
			hasil = 0;
			a = 1;
			b = 1;

			System.out.println(" ");			
			System.out.println("PROGRAM BARISAN FIBONACCI");
			System.out.println(" ");			
			System.out.print("Masukkan Banyaknya -N Barisan Fibonacci = ");
			
			cc = dataIn.readLine();
			c = Integer.parseInt(cc);
			
			for ( i = 1; i <= c; i++)
			{
				a = b;
				b = hasil;
				System.out.print(" ");
				System.out.print(hasil + "");
				hasil = a + b;
				
			}
			
			
			}
			
			catch ( IOException e )
			{
				System.out.print("Error!");
			}
		}
}