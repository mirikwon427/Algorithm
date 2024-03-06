import java.io.*;
import java.util.*;

public class Main {
    public static boolean contains369(int n) {
        while(n > 0) {
            if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean is369Number(int n) {
        if(n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(is369Number(i) || contains369(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}