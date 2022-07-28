package Bronze_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q4344 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		

        int count = Integer.parseInt(buffer.readLine());
        double answer[] = new double[count];
        
        
        for (int i = 0; i < count; i++) {
            int sum = 0;
            int avgcnt=0;
            String str = buffer.readLine();
            StringTokenizer token = new StringTokenizer(str);
            StringTokenizer temp = new StringTokenizer(str);
            temp.nextToken();
            int cnt = Integer.parseInt(token.nextToken());
            

            while(token.hasMoreTokens()){
                sum += Integer.parseInt(token.nextToken());
            }

            while(temp.hasMoreTokens()){
                String tempstr = temp.nextToken();
//                System.out.println(Integer.parseInt(tempstr)+"|"+(sum/cnt));
                if(Integer.parseInt(tempstr)>(sum/cnt)){
                    avgcnt++;
                }
            }
            answer[i]=((double)avgcnt/(double)cnt)*100;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(String.format("%.3f", answer[i])+"%");
        }

    }
}
