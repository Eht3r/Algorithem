package Sliver.Lv5;

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

        String[] dates = br.readLine().split(" ");
        ArrayList<String> months = new ArrayList<String>(
                Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September",
                        "October", "November", "December"));
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(dates[2]);
        int month = months.indexOf(dates[0]) + 1;
        int day = Integer.parseInt(dates[1].substring(0, dates[1].length() - 1));
        String[] times = dates[3].split(":");
        int hours = 60 * Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);
        int totalMinutes = hours + minutes;

        int totalMinutesInYear = 0;

        if (isYeepyear(year)) totalMinutesInYear = 366 * 24 * 60;
        else totalMinutesInYear = 365 * 24 * 60;

        for (int i = 0; i < month; i++) {
            if (i == 1 && isYeepyear(year)) totalMinutes += 29 * 24 * 60;
            else totalMinutes += days[i] * 24 * 60;
        }
        totalMinutes += (day - 1) * 24 * 60;


        bw.write((double) totalMinutes * 100 / (double) totalMinutesInYear+ "\n");
        bw.flush();
        bw.close();
    }

    public static boolean isYeepyear(int year) {
        if (year % 4 == 0) return year % 100 != 0 || year % 400 == 0;
        return false;
    }
}
