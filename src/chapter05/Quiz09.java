package chapter05;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int[] scores = null;
		
		int max = 0;
		int total = 0;
		float avg = 0;
		int count = 0;
		
		while(true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: {
				System.out.print("학생수 > ");
				choice = Integer.parseInt(sc.nextLine());
				scores = new int[choice];
				break;
			}
			case 2 : {
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores[" + i + "]> ");
					choice = Integer.parseInt(sc.nextLine());
					scores[i] = choice;
					total += scores[i];
					count++;
				}
				break;
			}
			case 3 : {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			}
			case 4 : {
				for(int i=0;i<scores.length-1;i++) {
					if(scores[i] < scores[i+1]) max = scores[i+1];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + total / (float) count);
			}
			break;
			case 5 : {
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("키를 잘못 입력하셨습니다.");
				break;
			}
			}
			
		}
	}
	
}
