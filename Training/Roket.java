import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Roket
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
		try
		{
		int i, x;

		String ii;
		
		System.out.println("PROGRAM PELUNCURAN ROKAT ");
		System.out.println(" ");
		System.out.print("Lama nya roket meluncur = ");
		System.out.println(" ");
		ii = dataIn.readLine();
		
		x = Integer.parseInt(ii);
		
		i = 1;
		while (i < x)
		{
			x = x - 1;
			System.out.println(x);
		}
		
		System.out.println(" ");
		System.out.println("GOOO!!!");
		}
		
		catch (IOException e )
		{
			System.out.println("Error!");
		}
	}
}