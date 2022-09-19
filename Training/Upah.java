import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Upah
{
	public static void main(String[] args)
		{
			BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
			try
			{
				int JamNormal, UpahLembur, jjk, lembur, UpahPerjam, UpahTotal;
				JamNormal = 48;
				UpahLembur = 3000;
				
				String nama, golongan, jamkerja, jawabb;
				
				char jawab, gol;
				
				System.out.println("PROGRAM PENGHITUNGA GAJI KARYAWAN");
				System.out.println("  ");
				do 
				{
					System.out.print("Masukkan Nama Karyawan : ");
					nama = dataIn.readLine();
				
					System.out.print("Masukkan Golongan Karyawan : ");
					golongan = dataIn.readLine();
				
					System.out.print("Masukkan Jam Kerja Karyawan : ");
					jamkerja = dataIn.readLine();
				
					gol = golongan.charAt(0);
					jjk = Integer.parseInt(jamkerja);
					UpahPerjam = 00;
					
					switch (gol)
					{
						case 'A':
							UpahPerjam = 4000;
							break;
						case 'B':
							UpahPerjam = 5000;
							break;
						case 'C':
							UpahPerjam = 6000;
							break;
						case 'D':
							UpahPerjam = 7500;
							break;
						default:
							System.out.print("Tak Ada");
					}
					
					if (jjk <= JamNormal)
					{
						UpahTotal = jjk*UpahPerjam;
						System.out.println("Gaji Nya Adalah = " + "Rp. " + UpahTotal);
					}
					else if (jjk >= JamNormal)
					{
						lembur = jjk - JamNormal;
						UpahTotal = JamNormal*UpahPerjam + lembur*UpahLembur;
						System.out.println("Gaji Nya Adalah = " + "Rp. " + UpahTotal);
					}
					
					System.out.println("Terima Kasih");
					System.out.println("Ulangi Untuk Karyawan yang lain?");
					jawabb = dataIn.readLine();
					jawab = jawabb.charAt(0);
				}	while (( jawab != 't') && ( jawab == 'y' ));
			}
			
			catch ( IOException e )
			{
				System.out.print("Error!");
			}
		}
}