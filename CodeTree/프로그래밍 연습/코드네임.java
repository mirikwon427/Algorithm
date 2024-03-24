import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution16 {
    public static class User{
        String codeName;
        int score;
        public User(String codeName, int score){
            this.codeName = codeName;
            this.score = score;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = 5;
        User[] user = new User[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String codeName = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            user[i] = new User(codeName, score);
        }

        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            if(user[minIdx].score > user[i].score) {
                minIdx = i;
            }
        }

        System.out.println(user[minIdx].codeName + " " + user[minIdx].score);
    }
}

