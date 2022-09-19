import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiMaksimum3
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int angka1, angka2, angka3;
		String x1 = "";
		String x2 = "";
		String x3 = "";
		
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
		
		System.out.print("Masukkan Angka ketiga = ");
		try
		{
			x3 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		angka1 = Integer.parseInt(x1);
		angka2 = Integer.parseInt(x2);
		angka3 = Integer.parseInt(x3);
		
		if( angka1 >= angka2 )
		{
			System.out.println(angka1 + " Adalah Bilangan Terbesar" );
		}
		else if (angka3 > angka2)
		{
			System.out.println(angka3 + " Adalah Bilangan Terbesar");
		}
		else
		{
			System.out.println(angka2 + " Adalah Bilangan Terbesar");
		}
	}
}