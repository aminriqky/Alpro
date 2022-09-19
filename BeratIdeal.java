import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BeratIdeal
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int Tinggi1, Tinggi2, Tinggi3, Berat, Sisa1, Sisa2;
		String X1 = "";
		
		System.out.print("Tinggi Badan = ");
		try
		{
			X1 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		Berat = Integer.parseInt(X1);
		Tinggi1 = Berat - 100;
		Tinggi2 = Tinggi1 * 90;
		Tinggi3 = Tinggi2 / 100;
		
		System.out.print("Berat Badan Ideal = " + Tinggi3);

	}
}