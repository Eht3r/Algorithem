package Silver.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class boj_10773 { // 제로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) stack.pop();
            else stack.push(num);
        }

        if (stack.isEmpty()) bw.write(0 + "\n");
        else {
            for (int num: stack)
                result += num;

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}
