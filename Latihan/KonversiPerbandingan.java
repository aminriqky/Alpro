import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KonversiPerbandingan
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int j1, j2, m1, m2, d1, d2, totalwaktu1, totalwaktu2, sisa1, sisa2, Banding1, Banding2, Banding3;
		
		String TotalDetik1 = "";
		String TotalDetik2 = "";
		
		System.out.print("Total detik waktu 1 = ");
		try
		{
			TotalDetik1 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		System.out.print("Total detik waktu 2 = ");
		try
		{
			TotalDetik2 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		totalwaktu1 = Integer.parseInt(TotalDetik1);
		j1 = totalwaktu1 / 3600;
		sisa1 = totalwaktu1 % 3600;
		m1 = sisa1 / 60;
		d1 = sisa1 % 60;
		
		totalwaktu2 = Integer.parseInt(TotalDetik2);
		j2 = totalwaktu2 / 3600;
		sisa2 = totalwaktu2 % 3600;
		m2 = sisa2 / 60;
		d2 = sisa2 % 60;
		
		Banding1 = j2-j1;
		Banding2 = m2-m1;
		Banding3 = d2-d1;
		
		System.out.println("Perbandingan Waktunya = " + Banding1 + "jam" + Banding2 + "menit" + Banding3 + "detik");
	}
}