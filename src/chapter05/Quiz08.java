package chapter05;

public class Quiz08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total = 0;
		int count = 0;
		float avg = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				total += array[i][j];
				count++;
			}
		}
		
		avg = total / (float) count;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}

}
