import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Enam
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		try 
		{
			int angka, lagi;
			
			String ang, lag;
			
			System.out.println("PROGRAM ANGKA ROMAWI");
			System.out.println("");
			
			
			do
			{
				System.out.print("Masukkan angka = ");
				ang = dataIn.readLine();
			
				angka = Integer.parseInt(ang);
				
				if (( angka < 1 ) || ( angka > 5000 ))
			{
				System.out.println("Maaf, tidak dalam jangkauan");
			}
			else 
			{
				while ( angka >= 1000 ) 
				{
					System.out.print("M");
					angka = angka - 1000;
					if ( angka >= 500) 
					{
						if ( angka >= 900 )
						{
							System.out.print("CM");
							angka = angka - 900;
						}
						else 
						{
							System.out.print("D");
							angka = angka - 500;
						}
					}
				}
			}				
				while ( angka >= 100 )
				{
					if ( angka >= 400 ) 
					{
						System.out.print("CD");
						angka = angka - 400;
					}
					else
					{
						System.out.print("C");
						angka = angka - 100;
					}
				}
				
				if ( angka >= 50 )
				{
					if ( angka >= 90 )
					{
						System.out.print("XC");
						angka = angka - 90;
					}
					else
					{
						System.out.print("L");
						angka = angka - 50;
					}
				}
				
				while ( angka >= 10 )
				{
					if ( angka >= 40 )
					{
						System.out.print("XL");
						angka = angka - 40;
					}
					else 
					{
						System.out.print("X");
						angka = angka - 10;
					}
				}
				
				if ( angka >= 5 )
				{
					if ( angka == 9 )
					{
						System.out.print("IX");
						angka = angka - 9;
					}
					else 
					{
						System.out.print("V");
						angka = angka - 5;
					}
				}
				
				while ( angka >= 1 )
				{
					if ( angka == 4 )
					{
						System.out.print("IV");
						angka = angka - 4;
					}
					else 
					{
						System.out.print("I");
						angka = angka - 1;
					}
				}
				
				System.out.println("");
				System.out.println("Mau coba lagi??  (1 : Ya 	0 : tidak)");
				
				lag = dataIn.readLine();
				
				lagi = Integer.parseInt(lag);
				
			} while (lagi != 0);
				
				} 
		
		catch ( IOException e )
		{
			System.out.println("Ërror!");
		}
		
	}
}