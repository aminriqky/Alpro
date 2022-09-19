import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TitikTengah
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int x1, x2, y1, y2, Tengah1, Tengah2;
		
		String Titikx1 = "";
		String Titikx2 = "";
		String Titiky1 = "";
		String Titiky2 = "";
		
		System.out.print("Titik x1 = ");
		try
		{
			Titikx1 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		System.out.print("Titik x2 = ");
		try
		{
			Titikx2 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		System.out.print("Titik y1 = ");
		try
		{
			Titiky1 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		System.out.print("Titik y2 = ");
		try
		{
			Titiky2 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		x1 = Integer.parseInt(Titikx1);
		x2 = Integer.parseInt(Titikx2);
		y1 = Integer.parseInt(Titiky1);
		y2 = Integer.parseInt(Titiky2);
		
		Tengah1 = (x1+x2)/2;
		Tengah2 = (y1+y2)/2;
		System.out.print("Titik Tengah = " + "(" + Tengah1);
		System.out.print("," + Tengah2 + ")");
	}
}