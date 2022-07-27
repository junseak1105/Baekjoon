package Bronze_I;

import java.util.*;

public class Q1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase();
        int[] arr = new int[26];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-65]++;
        }

        int max = 0;
        int ch = -2;

        for(int j =0;j<arr.length;j++){
            if(max<arr[j]){
                max = arr[j];
                ch = j;
            }else if(max==arr[j]){
                ch = -2;
            }
        }
        System.out.println((char)(ch+65));
    }
}
