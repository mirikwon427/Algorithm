import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//특정 구간의 합
public class Main {
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N+1];
    public static int isSum(int a, int b) {
        int answer = 0;
        for(int i = a-1; i <= b-1; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] a1 = new int[M];
        int[] a2 = new int[M];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a1[i] = Integer.parseInt(st.nextToken());
            a2[i] = Integer.parseInt(st.nextToken());
            System.out.println(isSum(a1[i], a2[i]));
        }
    }
}

//하기 방법이 수행시간이 더 짧음
public class Main {
    public static final int MAX_N = 100;
    public static int N,M;
    public static int[] arr = new int[MAX_N];
    public static int[] a1,a2;
    public static int answer;
    public static int[] result;
    public static int[] isAnswer(int[] a, int[] b) {
        result = new int[a.length];
        for(int i = 0; i <a.length ; i++) {
            for(int j = a[i]-1; j <= b[i]-1; j++) {
                answer += arr[j];
            }
            result[i] = answer;
            answer = 0;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        a1 = new int[M];
        a2 = new int[M];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a1[i] = Integer.parseInt(st.nextToken());
            a2[i] = Integer.parseInt(st.nextToken());
        }
        isAnswer(a1,a2);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}