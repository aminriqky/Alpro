import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GenapFungsi
{
	static void ge (int n)
	{
		int i, genap;
		genap = n;
		n = (2*n)-2;
		for ( i = -1; i <= n; i++)
		{
			i = i + 1;
			
			System.out.println(i);
		}
		System.out.println(" ");
		System.out.print("Banyak Nya bilangan Genap = " + genap);
	}
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		try
		{
			int n;
			
			String nilai;
			
			System.out.println("PROGRAM BANYAK BILANGAN GENAP");
			System.out.println(" ");
			
			System.out.print("Masukkan Banyak n = ");
			nilai = dataIn.readLine();
			n = Integer.parseInt(nilai);
			
			ge(n);
		
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
	}
}