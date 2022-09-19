import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rata
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		int n, x, jumlah, i; 
		double rata;
		
		String nilai = "";
		String nilaix = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Angka Rata Rata");
		System.out.println("");
		
		System.out.print("Banyaknya Nilai n = ");
		try
		{
		nilai = dataIn.readLine();	
		}
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
		
		n = Integer.parseInt(nilai);
		
		jumlah = 0;
		for ( i = 1; i<=n; i++)
		{
			System.out.print("Masukkan Nilai ke - " + i + " = ");
			try
			{
				nilaix = dataIn.readLine();
			}
				catch ( IOException e ) 
			{
				System.out.print("Error!");
			}
			x = Integer.parseInt(nilaix);
			jumlah = jumlah + x;
		}
		
		rata = jumlah / n;
		System.out.println("");
		System.out.println("Rata Rata nya Adalah = " + rata);
		System.out.println("");
		System.out.println("Terima Kasih!");
	
	}
}