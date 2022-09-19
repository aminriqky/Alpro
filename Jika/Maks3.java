import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Maks3
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int num1, num2, num3, sisa;
		String y1 = "";
		String y2 = "";
		String y3 = "";
		
		System.out.print("Masukkan Angka pertama = ");
		try
		{
			y1 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Masukkan Angka kedua = ");
		try
		{
			y2 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Masukkan Angka ketiga = ");
		try
		{
			y3 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		num1 = Integer.parseInt(y1);
		num2 = Integer.parseInt(y2);
		num3 = Integer.parseInt(y3);
		
		if( num1 >= num2 )
		{
			System.out.println(num1 + " Adalah Bilangan Terbesar" );
		}
		else if (num3 > num2)
		{
			System.out.println(num3 + " Adalah Bilangan Terbesar");
		}
		else
		{
			System.out.println(num2 + " Adalah Bilangan Terbesar");
		}
	}
}