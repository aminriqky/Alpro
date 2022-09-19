import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class satuA
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		int n, x, jumlah, i; 
		char ni;
		
		String nilai = "";
		String nilaix = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Cetak Huruf");
		System.out.println("");
		
		System.out.print("Banyaknya Huruf n = ");
		try
		{
		nilai = dataIn.readLine();	
		}
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
		
		n = Integer.parseInt(nilai);
		
		for ( i = 1; i<=n; i++)
		{
			System.out.print("Masukkan Huruf ke - " + i + " = ");
			try
			{
				nilaix = dataIn.readLine();
			}
				catch ( IOException e ) 
			{
				System.out.print("Error!");
			}
		
		}

		System.out.println("");
		System.out.println("Terima Kasih!");
	
	}
} 