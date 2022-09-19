import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Diskon
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int harga, diskon, sisa, tharga;
		
		String Harga = "";
		
		System.out.println("APAKAH ANDA DAPAT DISKON HAH :V");
		System.out.print("Masukkan Total Harga Belanja = ");
		try
		{
			Harga = dataIn.readLine();
		}
		catch (IOException e )
		{
			System.out.println("Error!");
		}
		
		harga = Integer.parseInt(Harga);
		diskon = harga * 50 / 100;
		tharga = harga - diskon;
		
		if ( harga >= 100000 ) 
		{
			System.out.println("Selamat, anda dapat diskon. dan harga belanja menjadi = " + tharga);
		}
		else 
		{
			System.out.println("BELANJO DIKIT NK MNTA DISKON NIH :v");
		}
	}
}