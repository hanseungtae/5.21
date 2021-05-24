package Practice0521;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 100미만의 양의 정수만 입력가능
		// 입력받다가 0 입력시 종료
		// 그전까지 입력받은 숫자 중 10의 자리의 개수를 세어 나타내는 프로그램
		
		int num[] = new int[100];
		int count[] = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<100;i++) {
			System.out.println("숫자를 입력해주세요(끝내려면 0 or 100이상의 숫자를 입력하세요)");
				num[i]=sc.nextInt();
				if(num[i]==0 || num[i]>=100) {
					break;
				}else {				
					switch(num[i]/10) {
					case 0: count[0]++; break;
					case 1: count[1]++; break;
					case 2: count[2]++; break;
					case 3: count[3]++; break;
					case 4: count[4]++; break;
					case 5: count[5]++; break;
					case 6: count[6]++; break;
					case 7: count[7]++; break;
					case 8: count[8]++; break;
					case 9: count[9]++; break;
					}
				}
			}
			for(int i=0;i<10;i++) {
				if(count[i]!=0) {
				System.out.println(i+" : "+count[i]);
			}
				}
			
			}
		}
