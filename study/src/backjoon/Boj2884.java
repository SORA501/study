package backjoon;

import java.util.Scanner;

public class Boj2884 {

	public static void main(String[] args) {
		// 45분 빨리 알람 맞추기
		
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M < 45) {
			// H에서 -1하고, M은 60 - 45 + M = 15 + M으로 표시
			// 예를 들어, 23시 40분 => 22시 55분
			H--;
			M = 60 + M - 45;
			
			if(H<0) { // 자정 전 23시로 표시.. H<=0 으로 하면 틀림
				H = 23;
			}
			
			System.out.println(H + " " + M);
		} else {
			M = M - 45;
			
			System.out.println(H + " " + M);
		}
		
		scan.close();
	}

}
