/*
 * 10951번
 * A+B-4
 * 
 * 입력
 * 입력은 여러 개의 테스트케이스로 이루어져 있다
 * 각 테스트 케이스는 한 줄로 이루어져 있으며 각 줄에 A와 B가 주어진다.
 * 
 * 출력
 * 각 테스트 케이스마다 A+B를 출력한다.
 * 
 * hasNextInt() 메소드로 숫자가 아닌 값이 입력 될 경우 while 문 탈출 및 종료
 */

import java.util.Scanner;
 
public class aplusb4th {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
			
		while(sc.hasNextInt()){
		
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		
		}	
	}
}