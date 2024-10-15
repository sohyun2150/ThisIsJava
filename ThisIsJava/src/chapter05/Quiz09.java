package chapter05;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int action = 0;
		int[] scores = null;

		while (true) {
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");

			System.out.print("선택> ");
			action = sc.nextInt();

			switch (action) {
			case 1:
				System.out.print("학생수> ");
				scores = new int[sc.nextInt()];
				break;
			case 2:
				if (scores == null) {
					System.out.println("학생 수를 먼저 입력 후 다시 시도해주세요.");
					break;
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				if (scores == null) {
					System.out.println("학생이 없습니다.");
					break;
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				if (scores == null) {
					System.out.println("학생이 없습니다.");
					break;
				}

				int sum = 0;
				int max = scores[0];

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];

					if (max <= scores[i]) {
						max = scores[i];
					}
				}

				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (float) sum / scores.length);
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				return;
			}
		}
	}

}
