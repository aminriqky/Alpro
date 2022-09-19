import java.util.*;

public class SatuB {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		char karakter;

		do {
			System.out.print("Masukkan karakter = ");
			karakter = sc.next().charAt(0);
		} while (karakter != '.');
	}
}