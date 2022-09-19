import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RataFungsi
{
	static void Rerata (double jumlah, int i)
	{
		double rata;
		i = i - 2;
		rata = jumlah / i;
		
		System.out.println("");
		System.out.println("Rata Rata nya Adalah = " + rata);
		System.out.println("");
		System.out.println("Terima Kasih!");
	}
	
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		int x, i;

		double jumlah;

		String nilai = "";
		String nilaix = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Angka Rata Rata");
		System.out.println("");
		
		jumlah = 0;
		i = 1;
		do
		{
			
			System.out.print("Masukkan Nilai " + i + " = ");
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
			
			i++;
			
		} while ( x != 9999);
		
		jumlah = jumlah - 9999;
		
		Rerata(jumlah, i);
	
	}
}