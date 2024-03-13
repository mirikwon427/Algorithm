import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//palindrome 여부 판단하기
public class Solution4 {
    public static boolean palindrome(String a) {
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != a.charAt(a.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        if(palindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
