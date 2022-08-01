package Bronze_I;

import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int k;
        int n;
        int ans[] = new int[cnt];
        for (int o = 0; o < cnt; o++) {
            k = in.nextInt();
            n = in.nextInt();
            int arr[][] = new int[k+1][n];
            //0층 생성
            for (int i = 0; i < n; i++) {
                arr[0][i] = i + 1;
            }
            //마지막꺼 뽑아오기
            for (int i = 1; i <= k; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum=0;
                    for (int l = 0; l <= j; l++) {
                        sum += arr[i - 1][l];
                    }
                    arr[i][j] = sum;
                }
                
            }
            // for (int i = 0; i <= k; i++) {
            //     for (int j = 0; j < n; j++) {
            //         System.out.print(arr[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            ans[o]=arr[k][n-1];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
