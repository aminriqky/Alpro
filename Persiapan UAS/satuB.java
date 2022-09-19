import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class satuB
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		char x2;
		String x1 = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Huruf Berlanjut");
		System.out.println("");
		
		do
		{
			try
		{
			x1 = dataIn.readLine();
		}
			catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
			x2 = x1.charAt(0);
		}	while (x2 != '.' );
		
		System.out.println("");
		System.out.println("Terima Kasih!");
		
	}
}