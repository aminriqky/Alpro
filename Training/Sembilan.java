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
				int angka, i, j, bagi1, bagi2;
				i = 2;
				j = 3;
				
				String ang;
								
				System.out.println("PROGRAM PENGHITUNGA BILANGAN PRIMA");
				System.out.println("  ");
				System.out.print("Masukkan Angka nya = ");
				
				ang = dataIn.readLine();
				angka = Integer.parseInt(ang);
				
				bagi1 = angka % j;
				bagi2 = angka % i;
				
				if (( bagi1 == 0) && ( bagi2 == 0 ))
				{
					System.out.print(angka + " Adalah Bilangan Prima");
				}
				else 
				{
					System.out.print(angka + " Bukanlah Bilangan Prima");
				}
				
			}
			
			catch ( IOException e )
			{
				System.out.print("Error!");
			}
		}
}