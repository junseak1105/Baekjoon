package Gold_IV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1717 {
    static int[] ori;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        ori = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            ori[i] = i;
        }

        for (int i = 0; i < m; i++) {
            token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            if(x==0){
                union(a,b);
            }else{
                checkSame(a,b);
            }
        }
    }

    static void union(int a, int b){
        a=find(a);
        b=find(b);
        if(a!=b){
            ori[b]=a;
        }
    }
    static int find(int x){
        if(ori[x]==x){
            return x;
        }else{
            ori[x]=find(ori[x]);
            return ori[x];
        }
    }
    static void checkSame(int a, int b){
        if (find(a) == find(b)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
//7 8
//0 1 3
//1 1 7
//0 7 6
//1 7 1
//0 3 7
//0 4 2
//0 1 1
//1 1 7
//
}
