import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Q2408 {
    public static void main(String[] args) {
		int[] arr = new int[3];
		Random random =new Random();
		Scanner in = new Scanner(System.in);
//		arr[0] = random.nextInt(6)+1;
//		arr[1] = random.nextInt(6)+1;
//		arr[2] = random.nextInt(6)+1;
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		Arrays.sort(arr);
		
		int result = 0;
		
		
		if(arr[0]==arr[1]&&arr[1]==arr[2]) {
			result = 10000+(arr[0]*1000);
		}else if((arr[0]==arr[1]&&arr[1]!=arr[2])||(arr[0]==arr[2]&&arr[1]!=arr[2])){
			result = 1000+(arr[0]*100);
		}else if(arr[0]!=arr[1]&&arr[1]==arr[2]) {
			result = 1000+(arr[1]*100);
		}else {
			result = arr[2]*100;
		}
		System.out.println(result);
	}
}
