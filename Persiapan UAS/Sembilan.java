import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sembilan
{
	public static void main(String[] args)
		{
			BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
			try
			{
				int angka, i, j, k, t, bagi1, bagi2, bagi3, bagi4;
				i = 2;
				j = 3;
				k = 5;
				t = 7;
				
				String ang;
								
				System.out.println("PROGRAM PENGHITUNGA BILANGAN PRIMA");
				System.out.println("  ");
				System.out.print("Masukkan Angka nya = ");
				
				ang = dataIn.readLine();
				angka = Integer.parseInt(ang);
				
				bagi1 = angka % j;
				bagi2 = angka % i;
				bagi3 = angka % k;
				bagi4 = angka % t;
				
				if (( angka == 2 ) || ( angka == 3 ) || ( angka == 5 ) || ( angka == 7 ))
				{
					System.out.print(angka + " Adalah Bilangan Prima");
				}
				else if (( bagi1 == 0) || ( bagi2 == 0 ) || ( bagi3 == 0 ) || ( bagi4 == 0 ) || ( Math.sqrt(angka) == 0 ))
				{
					System.out.print(angka + " Bukanlah Bilangan Prima");
				}
				else 
				{
					System.out.print(angka + " Adalah Bilangan Prima");
				}
				
			}
			
			catch ( IOException e )
			{
				System.out.print("Error!");
			}
		}
}