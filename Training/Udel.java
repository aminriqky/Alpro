import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Udel
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int A, N; 
		
		String x1 = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Angka Berlanjutan");
		System.out.println("");
		System.out.print("Masukkan Angka Pertama = ");
		try
		{
			x1 = dataIn.readLine();
		}
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
		
		
		A = Integer.parseInt(x1);
		
		N = 0;
		while (A >= N)
		{
			System.out.println(N);
			N++;
		}
		
		System.out.println("");
		System.out.println("Terima Kasih!");
		
	}
}