import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JumlahDeretFungsi
{
	static void Hitung(int n)
		{
			int i, jumlah;
			
			i = 1;
			jumlah = 0;
			while (i <= n)
			{
				jumlah = jumlah + i;			
				i++;
			}
			System.out.println("Jumlah Deret = " + jumlah);
			
		}
		
	public static void main(String[] args)
	{
		
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int n;
		
		String nilai = "";
		
		System.out.print("Masukkan Nilai n = ");
		
		try
		{
			nilai = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		n = Integer.parseInt(nilai);
		
		Hitung(n);
		
	}
}