import java.util.*;

public class SatuA {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Masukkan Berapa bnyk inputan = ");
		int n = sc.nextInt();

		char karakter;

		for (int i = 1; i <= n; i++) {
			System.out.print("Masukkan karakter ke - " + i + " = ");
			karakter = sc.next().charAt(0);
		}
	}
}