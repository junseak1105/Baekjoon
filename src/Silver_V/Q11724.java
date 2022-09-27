package Silver_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11724 {

    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//노드 갯수
        int m = Integer.parseInt(st.nextToken());//엣지갯수

        //A길이 설정
        A = new ArrayList[n + 1]; //노드갯수 +1
        visited = new boolean[n + 1];

        for (int i = 1; i <= n+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for(int i = 1; i<n+1; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }

    }

    static void dfs(int i) {
        //방문 여부확인
        if (visited[i]) {
            return;
        }
        //방문체크
        visited[i] = true;

        for(int j : A[i]){
            if(!visited[j]){
                dfs(j);
            }
        }
    }
}
