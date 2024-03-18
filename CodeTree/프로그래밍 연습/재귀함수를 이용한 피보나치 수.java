import java.util.*;
import java.io.*;

//재귀함수를 이용한 피보나치 수
public class Main {
    public static int fibo(int n) {
        if(n < 3) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        System.out.println(fibo(N));
    }
}