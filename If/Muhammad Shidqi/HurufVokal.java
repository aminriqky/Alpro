import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HurufVokal
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		String vokal = "";
		char huruf;
		
		System.out.print("Masukkan Huruf = ");
		try
		{
			vokal = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		huruf = vokal.charAt(0);
		
		if((huruf == 'a') || (huruf == 'i') || (huruf == 'u') || (huruf == 'e') || (huruf == 'o'))
		{
			System.out.println(huruf + " Adalah Huruf Vokal");
		}
		else
		{
			System.out.println(huruf + " Adalah Bukan Huruf Vokal");
		}
	}
}