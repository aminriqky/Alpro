import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UpahKaryawan2
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int jamkerja, lembur, upah1, upah2, golongan, jamnormal, upahperjam, upahlembur;
		jamnormal = 48;
		upahperjam = 2000;
		upahlembur = 3000;
		
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
		
		
		if (jamkerja <= jamnormal)
		{
			upah1 = jamkerja*upahperjam;
			System.out.println("Gajinya adalah = Rp. " + upah1);
			System.out.println("Penghasilan Perbukannya Adalah = " + upah1*4);
		}
		else 
		{
			lembur = (jamkerja - jamnormal);
			upah2 = jamnormal*upahperjam+lembur*upahlembur;
			System.out.println("Gajinya adalah = Rp. " + upah2);
			System.out.println("Penghasilan Perbukannya Adalah = " + upah2*4);
		} 
	}
}