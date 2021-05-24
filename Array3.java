package Practice0521;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 배열에 넣고 저장한 후 내림차순으로 출력
		Scanner sc=new Scanner(System.in);
		
		int[] Arr=new int[10];
		int tmp=0;
		
		for(int i=0; i<Arr.length;i++) {
			System.out.println((i+1)+"/"+Arr.length+" 숫자를 입력하세요");
			Arr[i]=sc.nextInt();
			}
		for(int i=0; i<Arr.length;i++) {
			for(int j=0; j<Arr.length-1;j++) {
				if(Arr[j]>Arr[j+1]) { // [0] >= [1] true=> 0과 1번 자리 바꿈 false면 유지
					tmp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=tmp;
					}
				}
			}
		
		// 배열 출력
		for(int i=Arr.length-1;i>0;i--) {			 
				System.out.print(Arr[i]+" ");
		}
	}

}
