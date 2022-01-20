package backjoon;

import java.util.Scanner;

public class Boj2739 {

	public static void main(String[] args) {
		// N 입력 받아서 구구단 출력하기
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
		
		scan.close();

	}

}
