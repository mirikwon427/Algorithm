import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//값을 반환하는 함수/ 그 계절, 그 날
public class Solution3 {
    public static int lastDayNumber(int y, int m) {
        System.out.println("8");
        if( m == 2 ) {
            if(isLeapYear(y)) {
                System.out.println("1");
                return 29;
            } else {
                System.out.println("2");
                return 28;
            }
        } else if ( m == 4 || m == 6 || m == 9 || m == 11 ) {
            System.out.println("3");
            return 30;
        }
        return 31;
    }
    public static boolean isLeapYear(int n) {
        System.out.println("9");
        if(n % 4 == 0) {
            if(n % 100 != 0) {
                System.out.println("4");
                return true;
            }
            if (n % 100 == 0 && n % 400 == 0) {
                System.out.println("5");
                return true;
            }
        }
        return false;
    }
    public static boolean judgeSeason(int y, int m, int d) {
        System.out.println("7");
        if( y <= 3000 && m <= 12 && d<= lastDayNumber(y,m)) {
            System.out.println("6");
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if(judgeSeason(Y,M,D)) {
            if( M >= 3 && M <= 5 ) {
                System.out.println("Spring");
            } else if( M >= 6 && M <= 8 ){
                System.out.println( "Summer");
            } else if ( M >= 9 && M <= 11 ) {
                System.out.println( "Fall");
            } else {
                System.out.println( "Winter");
            }
        } else {
            System.out.println("-1");
        }

    }
}