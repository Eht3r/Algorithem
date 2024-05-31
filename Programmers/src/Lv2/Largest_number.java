package Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Largest_number { // 가장 큰수
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] number = {6, 10, 2};
        bw.write(solution(number) + "\n");

        number = new int[]{3, 30, 34, 5, 9};
        bw.write(solution(number) + "\n");

        bw.flush();
        bw.close();
    }

    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        if (str[0].equals("0"))
            return "0";

        return String.join("", str);
    }
}

