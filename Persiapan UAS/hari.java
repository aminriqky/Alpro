import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hari
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		try 
		{
			String Hari;
			System.out.println(" ");
			System.out.print("Masukkan Nama Hari = ");
			Hari = dataIn.readLine();
			System.out.println(" ");
			switch (Hari)
					{
						case "senin":
							System.out.print("Hari Selanjutnya Adalah selasa");
							System.out.println(" ");
							break;
						case "selasa":
							System.out.print("Hari Selanjutnya Adalah rabu");
							System.out.println(" ");
							break;
						case "rabu":
							System.out.print("Hari Selanjutnya Adalah kamis");
							System.out.println(" ");
							break;
						case "kamis":
							System.out.print("Hari Selanjutnya Adalah jumat");
							System.out.println(" ");
							break;
						case "jumat":
							System.out.print("Hari Selanjutnya Adalah sabtu");
							System.out.println(" ");
							break;
						case "sabtu":
							System.out.print("Hari Selanjutnya Adalah minggu");
							System.out.println(" ");
							break;
						case "minggu":
							System.out.print("Hari Selanjutnya Adalah senin");
							System.out.println(" ");
							break;
						default:
							System.out.print("Tak Ada");
					}
			
		}
		
		catch ( IOException e )
		{
			System.out.print("Error");
		}
	}
}