import java.util.*;
// memasukkan class dan method yg ada di java util
// untuk memanggil input Scanner

public class Pengulangan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;

		// pengulangan do - while
		do {
			System.out.print("Masukkan Nilai = ");
			i = sc.nextInt();
		} while(i != 00);
	}
}