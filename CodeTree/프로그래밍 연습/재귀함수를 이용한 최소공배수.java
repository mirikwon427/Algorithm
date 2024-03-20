import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//재귀함수를 이용한 최소공배수
public class Main {
    public static final int MAX_N = 10;
    public static int N;
    public static int[] arr = new int[MAX_N +  1];

    //최소공배수 구하기
    public static int lcm(int a, int b) {
        //최대공약수
        int gcd = 1;
        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return a * b / gcd;
    }

    public static int getLCMAll(int index) {
        if(index == 1) {
            return arr[1];
        }
        // 1번째 ~ index - 1번째 원소의 최소공배수를 구한 결과와
        // 현재 index 원소의 최소공배수를 구하여 반환합니다.
        return lcm(getLCMAll(index -1),arr[index]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(getLCMAll(N));
    }
}