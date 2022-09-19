import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TigaBilanganUrut
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int A, B, C; 
		
		String x1 = "";
		String x2 = "";
		String x3 = "";
		
		System.out.println("INI ADALAH PROGRAM ANGKA TERBESAR");
		System.out.print("Masukkan Angka Pertama = ");
		try
		{
			x1 = dataIn.readLine();
		}
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
		
		System.out.print("Masukkan Angka Kedua = ");
		try
		{
			x2 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		System.out.print("Masukkan Angka Ketiga = ");
		try 
		{
			x3 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		A = Integer.parseInt(x1);
		B = Integer.parseInt(x2);
		C = Integer.parseInt(x3);
		
		if ((A > B ) && (A > C) && (B > C)) 
		{
			System.out.println("Angka Terkecilnya = " + C + " , " + B + " , " + A);
		}
		else if ((A > B ) && (A > C) && (B < C)) 
		{
			System.out.println("Angka Terkecilnya = " + B + " , " + C + " , " + A);
		}
		else if ((A < B ) && (A < C) && (B < C)) 
		{
			System.out.println("Angka Terkecilnya = " + A + " , " + B + " , " + C);
		}
		else if ((A < B ) && (A > C) && (B > C)) 
		{
			System.out.println("Angka Terkecilnya = " + C + " , " + A + " , " + B);
		}
		else if ((A > B ) && (A < C) && (B < C)) 
		{
			System.out.println("Angka Terkecilnya = " + B + " , " + A + " , " + C);
		}
		else if ((A < B ) && (A < C) && (B > C)) 
		{
			System.out.println("Angka Terkecilnya = " + A + " , " + C + " , " + B);
		}
		
		System.out.println("Terima Kasih!");
		
	}
}