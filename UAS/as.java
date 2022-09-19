import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class as
{
	static void bilGenap (int n)
	{
		int i, genap, jumlah;
		genap = n;
		n = (2*n)-2;
		jumlah = 0;
		for ( i = -1; i <= n; i++)
		{
			i = i + 1;
			jumlah = jumlah + i;

			System.out.println(i);
		}
		System.out.println(" ");
		System.out.print("Jumlah Nya bilangan Genap = " + jumlah);
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
			
			bilGenap(n);
		
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
	}
}