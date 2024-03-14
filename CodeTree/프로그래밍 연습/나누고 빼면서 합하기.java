import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//나누고 빼면서 합하기
public class Solution7 {
    public static final int MAX_N = 100;
    public static int n,m;
    public static int[] arr = new int[MAX_N];
    public static int answer;
    public static int isNumber(int b) {
        System.out.println("answer : " + answer);
        while(b >= 1 ) {
            if (b % 2 == 1) {
                answer += arr[b - 1];
                b -= 1;
            } else if (b % 2 == 0) {
                answer += arr[b - 1];
                b /= 2;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(isNumber(m));
    }
}
