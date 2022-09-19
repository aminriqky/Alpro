import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class gcd
{
	static void bagi ( int m, int n)
	{
		int r;
		
		while ( n != 0 )
		{
			if ( m < n)
			{
				System.out.print("Harap masukkan nilai M yg lebih besar dari N ");
			}
					
			r = m % n;
			m = n;
			n = r;	
		}
			
		System.out.print(m);
	}
	public static void main(String[] args)
		{
			BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
			try
			{
				int m, n;
				
				String nn, mm;
				
				System.out.print("Masukkan Nilai M = ");
				mm = dataIn.readLine();
				
				System.out.print("Masukkan Nilai N = ");
				nn = dataIn.readLine();
				
				m = Integer.parseInt(mm);
				n = Integer.parseInt(nn);
				
				bagi(m,n);
				
			}
			
			catch ( IOException e )
			{
				System.out.print("Error!");
			}
		}
}