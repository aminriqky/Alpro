import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Duaa
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		int n, x, jumlah, i; 
		double rata;
		
		String nilai = "";
		String nilaix = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Angka Ganjil");
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
		n = (2*n)-1;
		for ( i = 0; i<=n; i++)
		{
			i = i + 1;
			System.out.println(i);
			
			jumlah = jumlah + i;
		}
		
		System.out.println("");
		System.out.println("Hasilnya Adalah = " + jumlah);
		System.out.println("Terima Kasih!");
	
	}
}