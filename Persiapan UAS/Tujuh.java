import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tujuh
{
	public static void main(String[] args)
		{
			BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
			try
			{
				int saldo, kode, uang, setor, ambil;
				
				String sal, nama, code, set, am, ulang;
				
				char ulg;
								
				System.out.println("PROGRAM SETOR TARIK TUNAI");
				System.out.println("  ");
				do 
				{
					System.out.print("Masukkan Saldo Anda = ");
					sal = dataIn.readLine();
					saldo = Integer.parseInt(sal);
					
					if ( saldo > 10000 )
					{
						System.out.print("Masukkan Kode  (0 = Setor)  (1 = Ambil Uang) = ");
						code = dataIn.readLine();
						kode = Integer.parseInt(code);
						
						if ( kode == 0 )
						{
							System.out.print("Masukkan Nama Anda = ");
							nama = dataIn.readLine();
							
							System.out.print("Jumlah Uang Yang Ingin di Setor = ");
							set = dataIn.readLine();
							setor = Integer.parseInt(set);
						}
						else if ( kode == 1 )
						{
							System.out.print("Masukkan Nama Anda = ");
							nama = dataIn.readLine();
							
							System.out.print("Jumlah Uang Yang Ingin di Ambil = ");
							am = dataIn.readLine();
							ambil = Integer.parseInt(am);
						}
					}
					
					else 
					{
						System.out.println("MAAF SALDO KAU DK CUKUP");
					}
					
					System.out.println("Ingin Melakukan Transaksi Lain??");
					ulang = dataIn.readLine();
					ulg = ulang.charAt(0);
				}	while (( ulg != 't') && ( ulg == 'y'));
			}
			
			catch ( IOException e )
			{
				System.out.print("Error!");
			}
		}
}