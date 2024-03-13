import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2021년 날짜의 유무
public class Solution2 {
    public static int lastDayNumber(int n) {
        if(n == 2) {
            return 28;
        } else if ( n == 4 || n == 6 || n == 9 || n == 11) {
            return 30;
        }
        return 31;
    }
    public static boolean judgeDay(int m, int d) {
        if(m <= 12 && d <= lastDayNumber(m)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if(judgeDay(M,D)) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }

    }
}
