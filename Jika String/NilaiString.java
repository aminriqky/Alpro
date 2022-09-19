import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiString
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in ));
		try
		{
			
		String grade;

		System.out.println("");		
		System.out.println("INI ADALAH PROGRAM Nilai Anda");
		System.out.println("");
		
		System.out.print("Masukkan Nilai Anda = ");
		grade = dataIn.readLine();	
		
		if ( grade.equalsIgnoreCase("A"))
		{
			System.out.println("Nilai Anda A");
		}
		else if ( grade.equalsIgnoreCase("B"))
		{
			System.out.println("Nilai Anda B");
		}
		else 
		{
			System.out.println("Belum Terdefisnisi");
		}
		
		System.out.println("");
		System.out.println("Terima Kasih!");
		
		}
		
		catch ( IOException e ) 
		{
			System.out.print("Error!");
		}
	}
}