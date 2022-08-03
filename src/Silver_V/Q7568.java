package Silver_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q7568 {
    int Weight;
    int Height;

    public Q7568(int Weight,int Height){
        this.Weight=Weight;
        this.Height=Height;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());
        ArrayList list = new ArrayList();
        int arr[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            String str = buffer.readLine();
            StringTokenizer token = new StringTokenizer(str);
            int W=Integer.parseInt(token.nextToken());
            int H=Integer.parseInt(token.nextToken());
            list.add(new Q7568(W, H));
        }

        for (int i = 0; i < list.size(); i++) {
            int cnt_big=1;
            Q7568 temp_i = (Q7568)list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(i==j){
                    continue;
                }
                Q7568 temp_j = (Q7568)list.get(j);
                if((temp_i.Height<temp_j.Height) && (temp_i.Weight<temp_j.Weight)){
                    cnt_big ++;
                }
            }
            arr[i] = cnt_big;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
