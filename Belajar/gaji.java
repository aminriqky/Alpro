import javax.swing.JOptionPane;

public class gaji
{
	public static void main(String[] args)
	{
		String karyawan = null;
		String gaji_pokok = null;

		double pajak, tunjangan, gaji_bersih;

		karyawan = JOptionPane.showInputDialog("Masukkan nama karyawan");
		gaji_pokok = JOptionPane.showInputDialog("Masukkan gaji pokok");

		double g_pokok = Double.parseDouble(gaji_pokok);

		tunjangan = (20*g_pokok)/100;
		pajak = (15*(g_pokok + tunjangan))/100;

		gaji_bersih = g_pokok + tunjangan - pajak;

		JOptionPane.showMessageDialog(null, karyawan + ", Gaji Bersih nya = " + gaji_bersih);
	}
}