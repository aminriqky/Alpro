import java.io.*;

public class Tes
{
	public static void main(String[] args)
	{
		BufferedReader masuk = new BufferedReader ( new InputStreamReader ( System.in));
		try
		{
			int angka = 9;
			String kata = "saya";
			String jj;
			char j;
			char huruf = 'a';
			boolean b = true;
			boolean s = false;
		
			System.out.print("Masukkan Jawaban Siswa = ");
			
			jj = masuk.readLine();
			j = jj.charAt(0);
			
			char p = 'c';
		
			System.out.println("Jawaban Siswa adalah " + j );
			System.out.println("Kunci Jawabannya adalah " + p );
		
			if ( j == p )
			{
				System.out.println("Maka Jawaban nya Bernilai = " + b);
			}
			else
			{
				System.out.println("Maka Jawaban nya Bernilai = " + s);
			}
			
			
			}
		catch ( IOException e )
		{
			System.out.print("Error");
		}
	}
}