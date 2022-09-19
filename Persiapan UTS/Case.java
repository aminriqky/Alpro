import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Case
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int Bulan;
		
		String bulan = "";
		
		System.out.print("Masukkan Bulan berapa = ");
		try
		{
			bulan = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		Bulan = Integer.parseInt(bulan);
		
		switch (Bulan)
		{
			case 1:
				System.out.println("Ini Bulan Januari");
				break;
			case 2:
				System.out.println("Ini Bulan Februari");
				break;
			case 3:
				System.out.println("Ini Bulan Maret");
				break;
			case 4:
				System.out.println("Ini Bulan April");
				break;
			case 5:
				System.out.println("Ini Bulan Mei");
				break;
			case 6:
				System.out.println("Ini Bulan Juni");
				break;
			case 7:
				System.out.println("Ini Bulan Juli");
				break;
			case 8:
				System.out.println("Ini Bulan Agustus");
				break;
			case 9:
				System.out.println("Ini Bulan September");
				break;
			case 10:
				System.out.println("Ini Bulan Oktober");
				break;
			case 11:
				System.out.println("Ini Bulan November");
				break;
			case 12:
				System.out.println("Ini Bulan Desember");
				break;
			default:
				System.out.println("Katek lagi OI :v");
		}
	}
}