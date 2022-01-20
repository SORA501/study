package backjoon;

import java.util.Scanner;

public class Boj2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for(int i=0; i<N; i++) { // 별을 반복해서 찍기
			for(int j=0; j<=i; j++) {// 한줄에서 별을 반복해서 찍기
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
