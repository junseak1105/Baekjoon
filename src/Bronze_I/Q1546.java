package Bronze_I;

import java.util.*;

public class Q1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int arr[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        
        int max = arr[arr.length-1];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ((double)((double)arr[i]/(double)max))*100;
        }
        sum /= arr.length;
        System.out.println(sum);
        

    }
}
