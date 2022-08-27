/*
 * 10950번
 * 
 * A + B - 3
 * 입력 
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
 * 
 * 출력
 * 각 테스트 케이스 마다 A+B를 출력한다.
*/ 

import java.util.Scanner;

public class aplusb3rd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a;
        int b;
        for(int i =0;i<t;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}