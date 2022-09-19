import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Percakapan
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int j1, j2, j3, hh, mm, ss, sisa, durasi, biaya;
		
		String TotalDetik1 = "";
		String TotalDetik2 = "";
		
		System.out.print("Lama Panggilan (detik) = ");
		try
		{
			TotalDetik1 = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.println("Error!");
		}
		
		
		durasi = Integer.parseInt(TotalDetik1);
		hh = durasi / 3600;
		sisa = durasi % 3600;
		mm = sisa / 60;
		ss = sisa % 60;
		
		biaya = durasi*5;
		
				
		System.out.println("Lama Panggilan = " + hh + "jam" + mm + "menit" + ss + "detik");
		System.out.println("Biaya Panggilan = Rp.5/detik");
		System.out.println("Biaya Panggilan = Rp. " + biaya);
	}
}