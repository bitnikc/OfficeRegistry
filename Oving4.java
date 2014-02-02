package oving4;

public class Oving4 {
	
	public static int sum(int[] numbers) {
		int sum = 0;
		for (int i=0;i<numbers.length;i++)
			sum += numbers[i];
		return sum;
	}
	
	public static double sum(double[] numbers) {
		double sum = 0;
		for (int i=0;i<numbers.length;i++)
			sum += numbers[i];
		return sum;
	}

	public static void main(String[] args) {
		double[] numbers = {1.2,2.2};
		
		System.out.println(sum(numbers));

	}

}
