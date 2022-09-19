public class pitagoras
{
	public static void main(String[] args)
	{
		double a, b, c;

	
		a = Math.pow(3,2);
		b = Math.pow(4,2);

		//Memanggil Class "Math" dan Method "pow" dengan mengisi
		//parameter pertama dengan nilai variabel nya
		//dan parameter ke 2 adalah jumlah pangkat nya berapa;

		// a = Math.pow(a,2);
		// b = Math.pow(b,2);

		// pilih salah satu

		c = Math.sqrt(a+b);
		//memanggil class "Math" dan Method "sqrt" yang berfunsi
		//untuk menjalankan fungsi akar
		//lalu isi parameternya dengan nilai variabel

		System.out.println("Hasil sisi c adalah = " + c);
	}
}