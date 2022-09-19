import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Umur
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int u;
		
		String umur = "";
		
		System.out.println("PROGRAM UNTUK UMUR MU");
		System.out.print("Masukkan Umur mu = ");
		try
		{
			umur = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		u = Integer.parseInt(umur);
		
		if (u <= 5) 
		{
			System.out.println("Jika Umur mu Masih " + u + " Tahun" + " Anda Masih Balita");
		}
		else if ((u >= 5) && (u <= 12))
		{
			System.out.println("Jika Umur mu Masih " + u + " Tahun" + " Anda Masih Anak - Anak");
		} 
		else if ((u >= 12) && (u <= 20))
		{
			System.out.println("Jika Umur mu " + u + " Tahun" + " Maka Engkau Seorang Remaja");
		}
		else if ((u >= 20) && (u <= 60))
		{
			System.out.println("Jika Umur mu " + u + " Tahun" + " Engkau Telah Dewasa");
		}
		else if (u >= 60)
		{
			System.out.println("Jika Umur mu " + u + " Tahun" + " Engkau Sudah Tua");
		}
	}
}