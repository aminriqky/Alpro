public class Pengulangan {
	public static void main(String[] args) {
		// while untuk pengulangan yg belum psti jumlahnya
		// dan juga bisa bukan untuk angka saja
		// bisa untuk boolean, string, char

		boolean semat = false;
		while (semat == true) {
			System.out.print("Tampilkan diatas");
		}

		System.out.println("Untuk penambahan:");

		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		System.out.println("Untuk pengurangan:");

		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}
}