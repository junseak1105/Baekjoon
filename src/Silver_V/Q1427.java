package Silver_V;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = buffer.readLine();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        str ="";
        for (int i = chars.length-1; i >=0; i--) {
            str = str+chars[i];
        }
        System.out.println(str);

        }
}
