import javax.swing.JOptionPane;
import java.util.*;

public class tambah
{
	public static void main(String[] args)
	{
		String aaa = "";
		String bbb = null;

		aaa = JOptionPane.showInputDialog("Masukkan Angka A");
		bbb = JOptionPane.showInputDialog("Masukkan Angka B");

		int a = Integer.parseInt(aaa);
		int b = Integer.parseInt(bbb);
		int c = a+b;

		JOptionPane.showMessageDialog(null, c);
	}
}