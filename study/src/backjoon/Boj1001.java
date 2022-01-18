package backjoon;

import java.util.Scanner;

public class Boj1001 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 후, A-B 출력하기
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(A-B);
		
		scan.close();
		
	}

}
