package Gold.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class boj_12783 { // 가장 긴 증가하는 부분 수열 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] inputs = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(inputs[0]);
        for (int i = 1; i < inputs.length; i++) {
            if (dp.get(dp.size() - 1) < inputs[i]) {
                dp.add(inputs[i]);
            } else {
                int index = binarySearch(dp, inputs[i]);
                dp.set(index, inputs[i]);
            }
        }

        dp.sort(Collections.reverseOrder());
        bw.write(dp.size() + "\n");
        bw.flush();
        bw.close();
    }

    public  static int binarySearch(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if(x > a.get(mid)) low = mid + 1;
            else high = mid;
        }

        return low;
    }
}