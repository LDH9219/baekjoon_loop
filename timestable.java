/* 2739번
 * 
 * 구구단
 * 
 * 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력 : 출력 형식과 같게 N * 1 부터 N * 9 까지 출력한다.
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class timestable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i<=9; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}