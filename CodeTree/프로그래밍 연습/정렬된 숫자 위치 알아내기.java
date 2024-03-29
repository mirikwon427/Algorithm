import java.util.*;
import java.io.*;

//정렬된 숫자 위치 알아내기
public class Main {
    public static class Number implements Comparable<Number> {
        int num;
        int idx;

        public Number(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
        @Override
        public int compareTo(Number n) {
            if(this.num == n.num) {
                return this.num - n.num;
            }
            return this.num - n.num;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Number[] nums = new Number[N];
        int[] answer = new int[N];
        int numCache = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numCache = Integer.parseInt(st.nextToken());
            nums[i] = new Number(numCache,i);
        }
        Arrays.sort(nums);
        for(int i = 0; i < N; i++) {
            answer[nums[i].idx] = i+1;
        }
        for(int i = 0; i < N; i++) {
            System.out.println(answer[i] + " ");
        }
    }
}