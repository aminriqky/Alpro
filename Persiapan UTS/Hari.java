import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hari
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		
		int hari1, hari2,selisih,a,b,c,d,e,f,g;
		
		String h1 = "";
		String h2 = "";
		String Senin,Selasa,Rabu,Kamis,Jumat,Sabtu,Minggu;
		
		System.out.print("Masukkan Hari Pertama = ");
		try
		{
			h1 = dataIn.readLine();
		}
		catch ( IOException h )
		{
			System.out.print("Error!");
		}
		
		System.out.print("Masukkan Hari Kedua = ");
		try
		{
			h2 = dataIn.readLine();
		}
		catch ( IOException h )
		{
			System.out.print("Error!");
		}
		
		a=1;
		b=2;
		c=3;
		d=4;
		e=5;
		f=6;
		g=7;
		
		hari1 = Integer.parseInt(h1);
		hari2 = Integer.parseInt(h2);
		
		if(hari1>hari2){
			selisih = hari2-hari1+7;
			System.out.println("Hasil =" + selisih);
		}
		Senin=Integer.toString(a);
		Selasa=Integer.toString(b);
		Rabu=Integer.toString(c);
		Kamis=Integer.toString(d);
		Jumat=Integer.toString(e);
		Sabtu=Integer.toString(f);
		Minggu=Integer.toString(g);
		selisih=Senin;
	}
}