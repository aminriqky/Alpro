import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Karakter
{
	static void huruf (char n)
	{
		boolean benar = true;
		boolean salah = false;
		
		if ( n == 'a')
		{
			System.out.println(" ");
			System.out.print("True");
			System.out.println(" ");
		}
		else
		{
			System.out.println(" ");
			System.out.print("False");
			System.out.println(" ");
		}
	
	}
	
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));

		try
		{
			String nilai = "";
		
			char n;

			System.out.println("");		
			System.out.println("INI ADALAH PROGRAM HURUF A ");
			System.out.println("");
		
			System.out.print("Masukkan Huruf = ");
			nilai = dataIn.readLine();
			n = nilai.charAt(0);
		
			huruf(n);
	
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
	}
}