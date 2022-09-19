import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Maks
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int number1, number2, sisa;
		String x1 = "";
		String x2 = "";
		
		System.out.print("Masukkan Angka pertama = ");
		try
		{
			x1 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Masukkan Angka kedua = ");
		try
		{
			x2 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		number1 = Integer.parseInt(x1);
		number2 = Integer.parseInt(x2);
		
		if( number1 > number2 )
		{
			System.out.println(number1 + "Bilangan Terbesar" );
		}
		else if (number2 > number1)
		{
			System.out.println(number2 + "Adalah Bilangan Terbesar");
		}
	}
}