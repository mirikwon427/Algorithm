import java.util.*;
import java.io.*;
//최대로 겹치는 구간
public class Main{
    public static final int MAX_N = 100;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int[] checked = new int[MAX_R + 1];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine);

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine);
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            x1 += OFFSET;
            x2 += OFFSET;

            for(int j = x1; j < x2; j++) {
                checked[j]++;
            }
        }

        int max = 0;

        for(int i = 0; i <= MAX_R; i++) {
            if(max < checkd[i]) {
                max = checked[i];
            }
        }

        System.out.println(max);
    }
}