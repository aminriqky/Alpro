import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LuasPersegi
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int luas, panjang, lebar;
		String P = "";
		String L = "";
		
		System.out.print("Masukkan panjang = ");
		try
		{
			P = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Masukkan Lebar = ");
		try
		{
			L = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		panjang = Integer.parseInt(P);
		lebar = Integer.parseInt(L);
		
		luas = (panjang*lebar);
		
		System.out.println("Luas Persegi = " + luas);
	}
}