import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiMutlak
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int angka;
		String mutlak = "";
		
		System.out.print("Masukkan Angka = ");
		try
		{
			mutlak = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		angka = Integer.parseInt(mutlak);
		
		if( angka >= 0)
		{
			System.out.println(angka);
		}
		else if ( angka <= 0)
		{
			System.out.println(angka * -1);
		}
	}
}