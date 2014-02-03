package oving4;

public class Oving4 {
	
	public static int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers)
			sum += i;
		return sum;
	}
	
	public static double sum(double[] numbers) {
		double sum = 0;
		for (double i : numbers )
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Kontor k1 = new Kontor('E', 2, 12, 2);
		Ansatt a1 = new Ansatt("Abc", "KC", "abc@kc.cc", "12345678", k1);
		Ansatt a2 = new Ansatt("Cde", "KC", "cde@kc.cc", "91011121", k1);
		k1.leggTilAnsatt(a1);
		k1.leggTilAnsatt(a2);
		
		k1.skrivUtAnsattListe();
		//double[] numbers = {1.2,2.2,3.4};
		
		//System.out.println(sum(numbers));

	}

}
