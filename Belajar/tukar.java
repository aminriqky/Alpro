public class tukar
{
	public static void main(String[] args)
	{
		char A, B, C;

		A = 'a';
		B = 'b';

		System.out.println("Nilai Sebelum Ditukar. A = " + A + " , B = " + B);

		C = A; //nilai A dimasukkan Kedalam Variabel C (Sebagai tempat sementara)
		A = B; //lalu nilai B dimasukkan kedalam nilai A
		B = C; //dan Nilai C yg berisikan Nilai A tadi dipindahkan Kedalam B

		System.out.println("Setelah Ditukar. A = " + A + " , B = " + B);
	}
}