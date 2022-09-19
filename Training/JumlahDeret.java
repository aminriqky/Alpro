import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JumlahDeret
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
		
		j = 1;
		i = 1;
		sum = 1;
		while (i <= N)
		{
			i++;
			System.out.println(sum++);
			j = j + sum;
		}
		
		System.out.println("");
		System.out.println("Jumlah deret adalah = " + (j - sum));
		System.out.println("");
		System.out.println("Terima Kasih!");
		
	}
}