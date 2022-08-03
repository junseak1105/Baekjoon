package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
    

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(buffer.readLine());
        
        int five = 0;
        int three = 0;
        int temp = 0;

        int ans = 0;

        five = num/5;
        temp = num%5;

        while(true){
            if(temp%3==0){
                three = temp/3;
                ans = three + five;
                break;
            }else{
                if(five==0&&(temp%3!=0)){
                    ans = -1;
                    break;
                }else{
                    five--;
                    temp += 5;
                }
                
            }
        }

        System.out.println(ans);
    }
}
