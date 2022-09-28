package Silver_II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1541 {
    public static void main(String[] args) throws Exception{
        int result =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(),"-");
        ArrayList<String> str = new ArrayList<String>();
        while(token.hasMoreTokens()){
            str.add(token.nextToken());
        }
        for(int i=0;i<str.size();i++){
            int temp = 0;
            token = new StringTokenizer(str.get(i),"+");
            while(token.hasMoreTokens()){
                temp+=Integer.parseInt(token.nextToken());
            }
            if(i==0){
                result+=temp;
            }else{
                result -= temp;
            }

        }

        System.out.println(result);
    }
}
