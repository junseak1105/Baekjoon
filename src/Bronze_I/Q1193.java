package Bronze_I;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 0;
        int temp = 0;
        int i = 0;
        while (i<num) {
            if(temp%2==0){
                a=temp+1;
                b=-1;
                for (int j = a; j > 0; j--) {
                    if (i == num) {
                        break;
                    }
                    a-=1;
                    b+=1;
                    i++;
                    // System.out.print((a)+"/"+(b));
                    // System.out.print(" ");                    
                }
            }else{
                a=-1;
                b=temp+1;
                for (int j = b; j > 0; j--) {
                    if (i == num) {
                        break;
                    }
                    b-=1;
                    a+=1;
                    i++;
                    // System.out.print((a)+"/"+(b));
                    // System.out.print(" ");
                }
            }
            // System.out.println();
            
            temp++;
        }
        System.out.println((a+1)+"/"+(b+1));
    }

}
