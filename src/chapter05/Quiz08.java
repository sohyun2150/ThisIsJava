package chapter05;

public class Quiz08 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			count += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (float)sum / count);
	}
}
