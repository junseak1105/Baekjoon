package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {
    public static Stack stk = new Stack<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());
        String str[] = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            str[i] = buffer.readLine();
        }
        for (int j = 0; j < cnt; j++) {
            switch (str[j]) {
                case "pop":
                    if (!stk.empty()) {
                        System.out.println(stk.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stk.size());
                    break;
                case "empty":
                    if (stk.empty()) {
                        System.out.println(1);
                        ;
                    } else {
                        System.out.println(0);
                        ;
                    }
                    break;
                case "top":
                    if (!stk.empty()) {
                        System.out.println(stk.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                default:
                    stk.push(Integer.parseInt(str[j].substring(5)));
                    break;
            }
        }

    }
}
