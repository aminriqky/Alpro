import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JumlahDeret2
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int N, i, sum, j; 
		
		String x1 = "";

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Angka Berlanjutan");
		System.out.println("");
		System.out.print("Masukkan Angka Pertama = ");
		try
		{
			x1 = dataIn.readLine();
		}
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
		
		
		N = Integer.parseInt(x1);
		
		i = 1;
		sum = 0;
		while (i <= N)
		{
			sum = sum + i;			
			System.out.println(sum);
			i++;
		}
		
		System.out.println("");
		System.out.println("Jumlah deret adalah = " + sum);
		System.out.println("");
		System.out.println("Terima Kasih!");
		
	}
}