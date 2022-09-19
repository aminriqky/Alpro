import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KonversiJumlahDetik
{
	public static void main(String[] arguments)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		try
		{
		int j, m, d, JumlahDetik;
		
		String jam = "";
		String menit = "";
		String detik = "";
		
		System.out.print("jam = ");
			jam = dataIn.readLine();
		
		System.out.print("menit = ");
			menit = dataIn.readLine();
		System.out.print("detik = ");
			detik = dataIn.readLine();
		
		j = Integer.parseInt(jam)*3600;
		m = Integer.parseInt(menit)*60;
		d = Integer.parseInt(detik);
		

		JumlahDetik = (j+m+d);
		System.out.print("Total Detik nya = " + JumlahDetik);
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
	}
}