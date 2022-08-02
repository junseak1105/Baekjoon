package Silver_V;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Q1316 {

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());
        int ans = 0;
        boolean tof = true;

        for (int i = 0; i < cnt; i++) {
            String str = buffer.readLine();
            char temp_c = str.charAt(0);

            // System.out.println("현재 검사중인 문자:"+str);

            // 한단어면 무조건 증가
            if (str.length() == 1) {
                ans++;
                continue;
            } else {
                for (int j = 1; j < str.length(); j++) {
                    if (temp_c != str.charAt(j)) {
                        String temp = str.substring(j, str.length());
                        // System.out.println("분기점: 잘린문자-"+temp+"\t시행문자:"+temp_c+"\t");
                        if (temp.contains(Character.toString(temp_c))) {
                            // System.out.println("현재문자:"+str+" 중복된 char:"+temp_c+" 이탈합니다.");
                            tof = false;
                            break;
                        } else {
                            tof = true;
                            temp_c = str.charAt(j);
                        }
                    }
                }
                // System.out.println("----------------------");
            }

            if (tof) {
                // System.out.println("성공한 문자:"+str);
                ans++;
            }

        }

        System.out.println(ans);
    }
}
// 다른사람 풀이
// public class Q1316 {
// static BufferedReader br = new BufferedReader(new
// InputStreamReader(System.in));
// public static void main(String[] args) throws IOException {
// int N = Integer.parseInt(br.readLine());
// int count = 0;
// for (int i = 0; i < N; i++) {
// if (isGroupString()) count++;
// }
// System.out.println(count);
// }

// public static boolean isGroupString() throws IOException {
// boolean[] alphabetArr = new boolean[26];
// int previousChar = 0;
// String str = br.readLine();
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch != previousChar) {
// if (!alphabetArr[ch - 'a']) {
// alphabetArr[ch - 'a'] = true;
// previousChar = ch;
// } else {
// return false;
// }
// } else {
// continue;
// }
// }
// return true;
// }