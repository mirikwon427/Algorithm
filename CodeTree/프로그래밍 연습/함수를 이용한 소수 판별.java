import java.util.*;
import java.io.*;

public class Main {
    public static boolean primeNumber(int n) {
        if(n == 1) return false;

        for(int i = 2; i < n ; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int add = 0;
        for (int i = a; i <= b; i++) {
            if (primeNumber(i)) {
                add += i;
            }
        }
        System.out.print(add);
    }
}