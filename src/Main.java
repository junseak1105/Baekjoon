
import java.util.*;
import java.io.*;
public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1; i<n+1; i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }
        int count =0;
        for(int i = 1; i<= n; i++){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static void dfs(int i){
        if(visited[i]){
            return;
        }
        visited[i]=true;

        for(int j : list[i]){
            if(!visited[j]){
                dfs(j);
            }
        }
    }
}
