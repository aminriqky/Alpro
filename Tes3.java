import javax.swing.JOptionPane;

public class Tes2
{
	public static void main(String[] Args)
	{
		int waktu1, waktu2, waktu3, total;
		String w1 = "";
		String w2 = "";
		String w3 = "";
		
		waktu1 = Integer.parseInt(w1);
		waktu2 = Integer.parseInt(w2);
		waktu3 = Integer.parseInt(w3);
		
		w1 = JOptionPane.showInputDialog("Waktu Pertama");
		w2 = JOptionPane.showInputDialog("Waktu Kedua");
		w3 = JOptionPane.showInputDialog("Waktu Ketiga");
		total = (waktu1 + waktu2 + waktu3);
		
		String msg = ("Total Waktunya = " + total + "Detik");
		JOptionPane.showMessageDialog(null,msg);
	}
}