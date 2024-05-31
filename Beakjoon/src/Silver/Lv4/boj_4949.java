package Silver.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class boj_4949 { // 균형잡힌 세상
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>();
        set.add("(");
        set.add(")");
        set.add("[");
        set.add("]");
        input = br.readLine();

        //while (true) {
            String[] inputs = input.split("");

            for (String s : inputs) {
                if (set.contains(s)) {
                    stack.push(s);
                } else if (s.equals(".")) {
                    if (stack.isEmpty()) bw.write("yes");
                    else {
                        if (stack.peek().equals(")")) {
                            if (stack.search("(") != -1) {
                                stack.pop();
                                stack.remove(stack.search("("));
                            } else bw.write("no");
                        } else if (stack.peek().equals("]")) {
                            if (stack.search("[") !=-1) {
                                stack.pop();
                                stack.remove(stack.search("["));
                            } else bw.write("no");
                        }
                    }
                }
            }

        bw.flush();
        bw.close();
    }
}
