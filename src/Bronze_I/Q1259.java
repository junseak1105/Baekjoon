package Bronze_I;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// public class Q1259 {
//     public static final String YES = "yes";
//     public static final String NO = "no";

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         StringBuilder sb = new StringBuilder();

//         int N;
//         while ((N = Integer.parseInt(br.readLine())) != 0) {
//             String input = String.valueOf(N);

//             String result = YES;
//             for (int i = 0; i < (input.length() / 2); i++) {
//                 final char left = input.charAt(i);
//                 final char right = input.charAt(input.length() - (i + 1));
//                 if (left != right){
//                     result = NO;
//                     break;
//                 }
//             }
//             sb.append(result).append("\n");
//         }

//         bw.write(sb.toString());
//         bw.close();
//         br.close();
//     }
// }
//아래는 내코드(정상작동됨)
public class Q1259 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str = "";

        while (true) {
            str = in.next();
            if (str.equals("0")) {
                break;
            }
            arrayList.add(str);
        }

        String chk[] = new String[arrayList.size()];
        String temp = "yes";

        for (int i = 0; i < arrayList.size(); i++) {
            char chars[] = arrayList.get(i).toCharArray();

            if (Integer.parseInt(arrayList.get(i)) < 10) {
                temp = "no";
                chk[i]=temp;
            } else {
                for (int j = 0; j < (chars.length / 2); j++) {

                    if (chars[j] == chars[chars.length - j - 1]) {
                        temp = "yes";
                        chk[i] = temp;
                        // System.out.println("str:" + arrayList.get(i) + " \ti:" + i + "\tj:" +
                        // chars[j] + " vs "+ chars[(chars.length - j - 1)]+" chk:"+temp);
                    } else {
                        temp = "no";
                        chk[i] = temp;
                        // System.out.println("str:" + arrayList.get(i) + " \ti:" + i + "\tj:" +
                        // chars[j] + " vs "+ chars[(chars.length - j - 1)]+" chk:"+temp);
                        break;
                    }
                }
            }

        }

        for (int i = 0; i < chk.length; i++) {
            System.out.println(chk[i]);
        }
    }

}
