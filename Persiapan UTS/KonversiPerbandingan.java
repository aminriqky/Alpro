import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KonversiPerbandingan
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		
		int j1, j2, j3, m1, m2, m3, d1, d2, d3, sisa1, sisa2, total, banding1, tdetik1, tdetik2, banding2, banding3;
		
		String totaldetik1 = "";
		String totaldetik2 = "";
		
		
		System.out.print("Masukkan Total detik pertama = ");
		try
		{
			totaldetik1 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		System.out.print("Masukkan Total Detik kedua = ");
		try
		{
			totaldetik2 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}

		
		tdetik1 = Integer.parseInt(totaldetik1);
		tdetik2 = Integer.parseInt(totaldetik2);
		
		total = tdetik2 - tdetik1;
		
		j1 = total/3600;
		sisa1 = total%3600;
		m1 = sisa1/60;
		d1 = sisa1%60;
		
		System.out.println("Selisih Kedua Waktu Tersebut Adalahh = " + j1 + " jam " + m1 + " menit " + d1 + " detik ");
	}
}
		