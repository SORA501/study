package backjoon;

import java.util.Scanner;

public class Boj2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for(int i=0; i<N; i++) { // ���� �ݺ��ؼ� ���
			for(int j=0; j<=i; j++) {// ���ٿ��� ���� �ݺ��ؼ� ���
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
