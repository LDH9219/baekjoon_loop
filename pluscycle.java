/*
 * 1110
 * 더하기 사이클
 * 
 * 입력
 * 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 * 
 * 출력
 * 첫째 줄에 N의 사이클 길이를 출력한다.
 * 
 * 참조 : https://st-lab.tistory.com/42
 * 
 */



import java.util.Scanner;
 
public class pluscycle {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
        
		int cnt = 0;
		int copy = n;
        
		while (true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;
 
			if (copy == n ){
				break;
			}
		}
		System.out.println(cnt);
	}
}