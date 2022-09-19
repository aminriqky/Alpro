import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		try
		{
		int A, N; 
		
		String x1;

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Angka Berlanjutan");
		System.out.println("");
		System.out.print("Masukkan Angka Pertama = ");

		x1 = dataIn.readLine();	
		
		A = Integer.parseInt(x1);
		
		for ( N = 1; N<=A; N++)
		{
			System.out.println(N);
		}
		
		System.out.println("");
		System.out.println("Terima Kasih!");
		
		}
		
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
	}
}