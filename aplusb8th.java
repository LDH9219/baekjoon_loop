/*
 * 11022
 * A+B-8
 * 입력
 * 두 정수 A와 B를 입력 받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 출력
 * 각 테스트 케이스마다 "Case #x: A + B = C"형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며
 * C는 A+B이다.
 */
import java.util.Scanner;

public class aplusb8th {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b;
        int c;
        for(int i =1; i<=a ; i++){
            b = sc.nextInt();
            c = sc.nextInt();

            System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b+c));
        }
    }
}