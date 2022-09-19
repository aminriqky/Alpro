import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NamaJodoh
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));

		try 
		{
			String nama1, nama2, jawabb;
			
			char jawab;
			
			System.out.println(" ");
			System.out.print("PROGRAM UNTUK MELIHAT PASANGAN");
			System.out.println(" ");
			
			do 
			{
				System.out.println(" ");
				System.out.print("Masukkan Nama Pria = ");
				nama1 = dataIn.readLine();
			
			
				System.out.print("Masukkan Nama Wanita = ");
				nama2 = dataIn.readLine();
				
				System.out.println(" ");
			
				if (( nama1.equalsIgnoreCase("Leonando")) && ( nama2.equalsIgnoreCase("Ayu")))
				{
					System.out.println("Nah Cocok Kalian Ini :)");
				}
				else if (( nama1.equalsIgnoreCase("ridho")) && ( nama2.equalsIgnoreCase("rizky")))
				{
					System.out.println("Sakina Ma Waddah Wa Rohamah");
				}
				else 
				{
					System.out.println("Ais, Tak Cocok lah");
				}
				
				System.out.println(" ");
				System.out.print("Ingin Coba Nama Lain??");
				jawabb = dataIn.readLine();
				jawab = jawabb.charAt(0);
				
			} while ( jawab != 't');

			
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
	}
}