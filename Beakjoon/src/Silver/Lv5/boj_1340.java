package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class boj_1340 { // 연도 진행바
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        ArrayList<String> months = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        int year = Integer.parseInt(inputs[2]);
        int month = months.indexOf(inputs[0]);
        int day = Integer.parseInt(inputs[1].split(",")[0]);

        ArrayList<Integer> days = new ArrayList<>(Arrays.asList(31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));

        int hours = Integer.parseInt(inputs[3].split(":")[0]);
        int minutes = Integer.parseInt(inputs[3].split(":")[1]);

        int dayCnt = 0;
        for (int i = 0; i < month; i++) {
            dayCnt += days.get(i);
        }
        dayCnt += day;
        dayCnt--;

        double startDayMinute = (dayCnt * 24 * 60) + (hours * 60) + minutes;
        double endDayMinute = isLeapYear(year) ? (366 * 60 * 24) : (365 * 24 * 60);

        bw.write( startDayMinute * 100 / endDayMinute + "\n");
        bw.flush();
        bw.close();
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
