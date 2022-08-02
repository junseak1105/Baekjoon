package Silver_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = buffer.readLine();
        StringTokenizer token = new StringTokenizer(str);
        double A =Double.parseDouble(token.nextToken());
        double B =Double.parseDouble(token.nextToken());
        double V =Double.parseDouble(token.nextToken());
        
        System.out.println((int)Math.ceil((V-B)/(A-B)));
    }
    
}
