import javax.swing.JOptionPane;

public class Tes2
{
	public static void main(String[] Args)
	{
		String name = "";
		name = JOptionPane.showInputDialog("Masukkan Nama Anda");
		
		String msg = ("Hello " + name + "!");
		JOptionPane.showMessageDialog(null,msg);
	}
}