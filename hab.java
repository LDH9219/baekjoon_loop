/*
 * 8393번
 * 
 * 입력 : 첫째 줄에 n(1<=n<=10000)이 주어진다.
 * 출력 : 1부터 n 까지의 합을 출력한다.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum =0 ;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}