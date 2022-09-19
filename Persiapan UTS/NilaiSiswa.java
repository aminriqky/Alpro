import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiSiswa
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int grade, nilai;
		
		String n = "";
		
		System.out.print("Masukkan Nilai = ");
		try
		{
			n = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		nilai = Integer.parseInt(n);
		
		if ((nilai >= 80) && (nilai <= 100)) 
		{
			System.out.println("Selamat Anda Lulus");
		}
		else if ((nilai >= 70) && (nilai <= 79))
		{
			System.out.println("Mayan lahh");
		} 
		else if (nilai > 100)
		{
			System.out.println("Nilaimu Meluber :v");
		}
		else
		{
			System.out.println("HUU Olo :v");
		}

	}
}