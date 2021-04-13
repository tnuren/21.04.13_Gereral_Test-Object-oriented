package dasy11.pkg;

import java.util.Scanner;

public class Day11_01_General_Test {

	public static void main(String[] args) {
		// 1. 학생수 . 2점수입력 . 3 점수리스트 4. 분석 5. 종료

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0; // 학생수
		int[] score = null; // 점수
		int i = 0;
		int j = 0;
		int max = 0;		
		double sum = 0;
		int temp = 0;

		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 학생수 ㅣ  2. 점수입력  ㅣ 3. 점수리스트 ㅣ 4. 분석 ㅣ 5. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			int selct = scan.nextInt();

			if (selct == 1) {
				System.out.print("학생수 > ");
				num = scan.nextInt();
				score = new int[num];

			} else if (selct == 2) { // 배열의 데이터 저장

				for (i = 0; i < score.length; i++) {
					System.out.print((i + 1) + "번째 학생점수 : ");
					score[i] = scan.nextInt();
				}

			} else if (selct == 3) { // 배열에 저장된 데이터 출력
				for (i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번째 학생점수 : " + score[i]);
				}

			} else if (selct == 4) { // 최대값 , 평균값 , 내림차순 정렬
				for (i = 0; i < score.length; i++) {
					sum = sum + score[i];
					if (max < score[i]) {
						max = score[i];
					}
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + sum / score.length);
				
				for (i = 0; i < score.length; i++) {
									
				for (j = i; j < score.length; j++) {
					if (score[i] < score[j]) {
						temp = score[i];
						score[i] = score[j];
						score[j] = temp;

					}
				}System.out.println(score[i]);
				}
				

			} else if (selct == 5) {
				System.out.println("종료합니다.");
				run = false;
			}
		}

	}

}
