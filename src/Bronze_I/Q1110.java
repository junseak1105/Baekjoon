package Bronze_I;

import java.util.*;

public class Q1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i = 0, a = 0, b = 0;
        if (num < 10) {
            num *= 10;
        }
        int temp = num;
        a = temp / 10;
        b = temp % 10;
        temp = (a+b)%10;
        do {
            a=b;
            b=temp;
            temp = (a+b)%10;
            i++;
        } while (num != (a*10+b));
        System.out.println(i);
    }
}
