package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012 {


    public static void main(String[] args) throws NumberFormatException, IOException {
    
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());
        String ans[] = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            char temp[] = buffer.readLine().toCharArray();
            int open = 0;

            for (int j = 0; j < temp.length; j++) {
                if(!((temp[j] == ')') && open == 0)){
                    if(temp[j] =='('){
                        open++;
                    }else{
                        open--;
                    }
                }else{
                    ans[i] = "NO";
                    open--;
                    break;
                }
                // System.out.println(temp[j]+" "+open);
            }
            if(open==0){
                ans[i] = "YES";
            }else{
                ans[i] = "NO";
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
