package Practice0521;

import java.util.Scanner;

public class CharPyramid {

	public static void main(String[] args) {
		
		// 자연수 n( 3 <= n <= 10 ) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성
		// 입력예 : 3  출력예 ABC
		//				   DE
		//                 F
		
		
		Scanner sc = new Scanner(System.in);
		
		//자연수 n 입력받기
		System.out.println("자연수 3~ 10을 입력해주세요.");
		int n = sc.nextInt();
		
		//알파벳 시작점 설정.
		char alphabet = 'A';
		
		// 줄반복.
		for(int i = n; i > 0; i--) {
			//자연수 범위 검증
			if((n < 3) || (n >10)) {
				System.out.println("입력한 자연수는 범위를 벗어났습니다.");
				break;
			}
			//알파벳 피라미드
			//입력받은 자연수 n만틈 반복.
			for(int j = i; j >= 1; j--) {
				System.out.print(alphabet);
				alphabet++;
				// Z를 넘어가면 다시 A로
				if(alphabet == 'Z'+1) alphabet = 'A';
			}
			System.out.println();
		}
	}

}

	
