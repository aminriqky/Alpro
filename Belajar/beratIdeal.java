public class beratIdeal
{
	public static void main(String[] args)
	{	
		double tinggi, tinggi2, berat, ideal;
		
		tinggi = 170;
		tinggi2 = tinggi/100;
		berat = 60;
		
		ideal = berat/Math.pow(tinggi2,2);
		
		System.out.print("Berat Masa Index = " + ideal);

		System.out.println("");

		if (ideal <= 18.5)
		{
			System.out.println("Kurus");
		}
		else if ( (ideal > 18.5) && (ideal <= 25) ) 
		{
			System.out.println("Normal");
		}
		else if ( (ideal > 25) && (ideal <= 30) ) 
		{
			System.out.println("Gemuk");
		}
		else
		{
			System.out.println("Obesitas");
		}
	}
}