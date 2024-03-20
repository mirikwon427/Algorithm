import java.util.*;
import java.io.*;

//k번째로 신기한 문자열
public class Solution14 {
    public static final int MAX_N = 100;

    public static int n,k;
    public static String T;
    public static int cnt;

    public static String[] str = new String[MAX_N];
    public static String[] words = new String[MAX_N];
    public static boolean startsWith(String a, String b) {
        if(a.length() < b.length()) {
            return false;
        }
        for(int i = 0; i < b.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        T = st.nextToken();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken();

            if(startsWith(str[i], T)) {
                words[cnt++] = str[i];
            }
        }

        Arrays.sort(words,0,cnt);

        System.out.print(words[k-1]);
    }
}