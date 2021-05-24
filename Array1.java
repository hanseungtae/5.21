package Practice0521;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		/* 
		 * 100개의 정수를 저장할수 있는 배열을 선언하고 정수를 차례대로 입력받다가 0이 입력되면 
		 * 0을 제외하고 그때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("수를 입력하세요: ");
			num[i] = sc.nextInt();
			if(num[i]==0) break;
		}
		for(int i=num.length-1;i>=0;i--) {
			if(num[i]!=0) {
				System.out.println(num[i]+" ");
			}
		}
		
	}

}
