package backjoon;

import java.util.Scanner;

public class Boj2884 {

	public static void main(String[] args) {
		// 45�� ���� �˶� ���߱�
		
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M < 45) {
			// H���� -1�ϰ�, M�� 60 - 45 + M = 15 + M���� ǥ��
			// ���� ���, 23�� 40�� => 22�� 55��
			H--;
			M = 60 + M - 45;
			
			if(H<0) { // ���� �� 23�÷� ǥ��.. H<=0 ���� �ϸ� Ʋ��
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
