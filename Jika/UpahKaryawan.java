import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UpahKaryawan
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int jamkerja, lembur, upah1, upah2, golongan;
		
		String gol = "";
		String nama = "";
		String jk = "";
		String lm = "";
		String up1 = "";
		String up2 = "";
		
		System.out.print("Nama Karyawan = ");
		try
		{
			nama = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Golongan = ");
		try
		{
			gol = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		System.out.print("Jam Kerja = ");
		try
		{
			jk = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		jamkerja = Integer.parseInt(jk);
		
		
		if (jamkerja <= 48)
		{
			upah1 = jamkerja*2000;
			System.out.println("Gajinya adalah = Rp. " + upah1);
		}
		else 
		{
			lembur = (jamkerja - 48);
			upah2 = 48*2000+lembur*3000;
			System.out.println("Gajinya adalah = Rp. " + upah2);
		}
	}
}