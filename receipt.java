/*
 * 25304번
 * 영수증
 * 입력 :
 * 첫째 줄에는 영수증에 적힌 총 금액
 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류 수
 * 이후 N 개의 줄에 각 물건의 가격 a와 개수 b가 공백을 두고 주어진다.
 * 
 * int total, price, count
 * 
 */

import java.util.Scanner;

public class receipt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total =  sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        }

        if(total == 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}