package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1308 { // D-Day
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] start = br.readLine().split(" ");
        int start_year = Integer.parseInt(start[0]);
        int start_month = Integer.parseInt(start[1]);
        int start_day = Integer.parseInt(start[2]);

        String[] end = br.readLine().split(" ");
        int end_year = Integer.parseInt(end[0]);
        int end_month = Integer.parseInt(end[1]);
        int end_day = Integer.parseInt(end[2]);

        int year = end_year - start_year;

        int result = 0;

        if (year > 1000 || (year == 1000 && ((end_month > start_month) || (end_month == start_month && end_day >= start_day)))) {
            bw.write("gg");
        } else {
            for (int i = start_year + 1; i < end_year; i++) {
                if (isLeapYear(i)) {
                    result += 366;
                } else {
                    result += 365;
                }
            }

            if (start_year == end_year) {
                for (int i = start_month; i <= end_month; i++) {
                    result += getDays(start_year, i);
                }
            } else {
                for (int i = start_month; i <= 12; i++) {
                    result += getDays(start_year, i);
                }

                for (int i = 1; i <= end_month; i++) {
                    result += getDays(end_year, i);
                }
            }
            result -= start_day;
            result -= getDays(end_year, end_month) - end_day;

            bw.write("D-" + result);
        }

        bw.flush();
        bw.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDays(int year, int month) {
        for (int i = 1; i <= 7; i++) {
            if (month == i) {
                if (i % 2 == 0) {
                    if (i == 2) {
                        if (isLeapYear(year)) return 29;
                        else return 28;
                    } else return 30;
                } else return 31;
            }
        }

        for (int i = 8; i <= 12; i++) {
            if (month == i) {
                if (i % 2 == 0) return 31;
                else return 30;
            }
        }
        return 0;
    }
}
