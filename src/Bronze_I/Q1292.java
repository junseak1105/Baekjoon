package Bronze_I;
import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum =0;
        int temp = 0;
        int i = 0;

        while(i<1000){
            temp++;
            for(int j= temp;j>0;j--){
                arr[i]=temp;
                i++;
                if(i>=1000){
                    break;
                }
            }
            
        }

        for (int j=a-1;j<b;j++) {
            sum += arr[j];          
        }
        System.out.println(sum);
    }
}
