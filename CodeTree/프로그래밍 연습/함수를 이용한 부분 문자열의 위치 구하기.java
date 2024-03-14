import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//함수를 이용한 부분 문자열의 위치 구하기
public class Solution6 {
    public static String N,M;
    public static boolean isSubSeq(int startIdx) {
        int n = N.length();
        int m = M.length();

        if(startIdx + m > n) {
            return false;
        }
        for(int i = 0 ; i < m; i++) {
            if(N.charAt(startIdx + i) != M.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static int findIndex() {
        int n = N.length();
        for(int i = 0 ; i < n; i++) {
            if(isSubSeq(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.nextToken();
        st = new StringTokenizer(br.readLine());
        M = st.nextToken();

        if(findIndex() == -1) {
            System.out.print(-1);
        } else {
            System.out.print(findIndex());
        }
    }
}
