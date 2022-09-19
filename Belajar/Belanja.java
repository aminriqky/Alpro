import javax.swing.JOptionPane;

public class Belanja
{
	public static void main(String[] args)
	{
		String nama = null;
		String b = null;
		String c = null;

		nama = JOptionPane.showInputDialog("Masukkan Nama Pembeli");
		b = JOptionPane.showInputDialog("Masukkan Harga Barang");
		c = JOptionPane.showInputDialog("Masukkan Jumlah Barang");

		int harga = Integer.parseInt(b);
		int jumlah = Integer.parseInt(c);

		int total = harga * jumlah;

		JOptionPane.showMessageDialog(null, "Nama Pembeli " + nama + " Total Harga = " + total);
	}
}