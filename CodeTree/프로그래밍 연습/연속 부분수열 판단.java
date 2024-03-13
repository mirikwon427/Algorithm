import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//연속 부분수열 판단하기
public class Solution {

    public static final int MAX_N = 100;

    public static int n1, n2;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];

    public static boolean isSame(int n) {
        for(int i = 0; i < n2; i++) {
            if(a[i + n] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSubsequence() {
        for(int i = 0; i <= n1 - n2; i++) {
            if(isSame(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n2; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        if(isSubsequence()) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }
    }
}