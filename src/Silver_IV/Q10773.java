package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack stk = new Stack<>();
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(buffer.readLine());
            if(num == 0){
                stk.pop();
            }else{
                stk.push(num);
            }
        }
        int sum = 0;
        while(!stk.empty()){
            sum+=(int)stk.pop();
        }
        System.out.println(sum);
    }
}
