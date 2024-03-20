import java.util.*;
import java.io.*;

//순서를 바꾸었을 때 같은 단어인지 판별하기
public class Main {
    public static final int MAX_N = 100000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String B = st.nextToken();

        char[] charsA = A.toCharArray();
        Arrays.sort(charsA);
        String sortedA = new String(charsA);

        char[] charsB = B.toCharArray();
        Arrays.sort(charsB);
        String sortedB = new String(charsB);

        if(sortedA.equals(sortedB)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
