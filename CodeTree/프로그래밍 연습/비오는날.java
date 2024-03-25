import java.util.*;
import java.io.*;

public class Main {
    public static class Forecast {
        String date;
        String day;
        String weather;

        public Forecast(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }
    }
    public static Forecast ans = new Forecast("9999-99-99","","");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String weather = st.nextToken();

            Forecast forecast = new Forecast(date, day, weather);

            if(weather.equals("Rain")) {
                if(ans.date.compareTo(forecast.date) > 0) {
                    ans = forecast;
                }
            }
        }
        System.out.print(ans.date + " " + ans.day + " " + ans.weather);
    }
}