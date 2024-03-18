import java.util.*;
import java.io.*;

//홀수짝수에 대한 출력값
public class Main {
    public static int getSum(int n) {
        if(n == 2) {
            return 2;
        }
        if(n == 1) {
            return 1;
        }
        return getSum(n-2) + n;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        System.out.print(getSum(N));
    }
}