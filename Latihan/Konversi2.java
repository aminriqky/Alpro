import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Konversi2
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int j, m, d, totalwaktu, sisa;
		
		String TotalDetik = "";
		
		
		System.out.print("Total detik waktu = ");
		try
		{
			TotalDetik = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		totalwaktu = Integer.parseInt(TotalDetik);
		j = totalwaktu / 3600;
		sisa = totalwaktu % 3600;
		m = sisa / 60;
		d = sisa % 60;
		
		System.out.print("Total waktu = " + j + "jam" + m + "menit" + d + "detik");
	}
}