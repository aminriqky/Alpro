import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GenapGanjil
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int num, y, sisa;
		String y1 = "";
		
		System.out.print("Masukkan Angka = ");
		try
		{
			y1 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		num = Integer.parseInt(y1);
		y = num / 2;
		sisa = num % 2;
		
		if( sisa == 0)
		{
			System.out.println("Genap");
		}
		else
		{
			System.out.println("Ganjil");
		}
	}
}