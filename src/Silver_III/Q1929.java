package Silver_III;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(token.nextToken());
        int N = Integer.parseInt(token.nextToken());
        int arr[] = new int[N+1];


        for(int i=2;i<=N;i++){
            arr[i]=i;
        }

        for(int i=2;i<=Math.sqrt(N);i++){ //sqrt 안해도 가능
            if(arr[i]==0){
                continue;
            }
            for(int j = i+i; j<=N;j+=i){
                arr[j]=0;
            }
        }
        for(int i=M;i<=N;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
