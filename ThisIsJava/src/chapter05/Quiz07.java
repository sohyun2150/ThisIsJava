package chapter05;

public class Quiz07 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = array[0]; 
		
		for (int element : array) {
			if (max <= element) {
				max = element;
			}
		}
		
		System.out.println("Max value: " + max);
	}
}
