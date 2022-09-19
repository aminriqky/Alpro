import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rata2
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));
		try
		{
			int x, i, sum, rata;
			
			String xx;
			
			System.out.println("PROGRAM INPUT NILAI");
			System.out.println(" ");
			
			System.out.print("Masukkan Nilai = ");
			xx = dataIn.readLine();
			x = Integer.parseInt(xx);
			
			sum = 0;
			i = 0;
			while ( x != -1)
			{			
				i = i + 1;
				sum = sum + x;
				System.out.print(x);
			}
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
	}
}