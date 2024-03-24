import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//사는지역
public class Main {
    public static class Person {
        String name;
        String addr;
        String city;

        public Person(String name, String addr, String city) {
            this.name = name;
            this.addr = addr;
            this.city = city;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Person[] person = new Person[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String addr = st.nextToken();
            String city = st.nextToken();
            person[i] = new Person(name, addr, city);
        }

        int minIdx = 0;
        for(int i = 1; i < N; i++) {
            int ans = person[minIdx].name.compareTo(person[i].name);

            if(ans < 0) {
                minIdx = i;
            }
        }

        System.out.println("name " + person[minIdx].name);
        System.out.println("addr " + person[minIdx].addr);
        System.out.println("city " + person[minIdx].city);

    }
}
