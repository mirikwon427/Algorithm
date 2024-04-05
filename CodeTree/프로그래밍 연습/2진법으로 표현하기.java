import java.util.*;
import java.io.*;

//2진법으로 표현하기
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] digits = new int[20];
        int cnt = 0;

        while(true) {
            if(n < 2) {
                digits[cnt++] = n / 2;
                break;
            }
            digits[cnt++] = n % 2;
            n /= 2;
        }

        for(int i = cnt -1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}