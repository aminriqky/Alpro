import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Vokal
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		String vokal = "";
		char hurufVokal;
		
		System.out.println("PT ASU 2018"
		System.out.print("Masukkan Huruf = ");
		try
		{
			vokal = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		hurufVokal = vokal.charAt(0);
		
		if((hurufVokal == 'a') || (hurufVokal == 'i') || (hurufVokal == 'u') || (hurufVokal == 'e') || (hurufVokal == 'o'))
		{
			System.out.println("Huruf Vokal");
		}
		else
		{
			System.out.println("Huruf Lain");
		}
	}
}