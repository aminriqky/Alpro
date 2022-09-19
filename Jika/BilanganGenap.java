import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BilanganGenap
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int angka, x, sisa;
		String x1 = "";
		
		System.out.print("Masukkan Angka = ");
		try
		{
			x1 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		angka = Integer.parseInt(x1);
		x = angka / 2;
		sisa = angka % 2;
		
		if( sisa >= 1)
		{
			System.out.println("Ganjil");
		}
		else
		{
			System.out.println("Genap");
		}
	}
}