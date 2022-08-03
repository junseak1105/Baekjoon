package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(buffer.readLine());
        int arr[] = new int[num];
        int sum = 0;

        String str = buffer.readLine();
        StringTokenizer token = new StringTokenizer(str);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i]*num);
            num--;
        }
        System.out.println(sum);
    }
}
