/*
 * 2438
 * 별 찍기
 * 
 * 입력
 * 첫째 줄에 N(1<=N<=100)이 주어진다.
 * 
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.util.Scanner;

public class star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1 ; i<=a; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}