import java.util.*;
import java.io.*;

//재귀함수를 이용한 최댓값
public class Main {
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];
    public static int maxValue(int n) {
        if( n==0 ) {
            return arr[0];
        }
        return Math.max(maxValue(n-1),arr[n]);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(maxValue(N));

    }
}
