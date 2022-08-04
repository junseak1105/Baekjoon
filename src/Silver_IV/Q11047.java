package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = buffer.readLine();
        StringTokenizer token = new StringTokenizer(input);
        int cnt = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        int arr[] = new int[cnt];
        int sum = 0;

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(buffer.readLine());
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if(K<arr[i]){
                continue;
            }else{
                sum+=(K/arr[i]);
                K=K%arr[i];
            }
        }

        System.out.println(sum);


    }
}
