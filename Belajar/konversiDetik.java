public class konversiDetik
{
	public static void main(String[] args)
	{
		int hh, mm, ss, totalDetik, sisa;

		totalDetik = 3200;

		hh = totalDetik / 3600;
		sisa = totalDetik % 3600;
		mm = sisa / 60;
		ss = sisa % 60;

		System.out.println("Waktunya Sekarang Adalah: " + hh + " jam " + mm +" menit " + ss + " detik");
	}
}