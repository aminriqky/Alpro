import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiYangMutlak
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int num;
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
		
		
		num = Integer.parseInt(mutlak);
		
		if( num >= 0)
		{
			System.out.println(num);
		}
		else if ( num <= 0)
		{
			System.out.println(num * -1);
		}
	}
}