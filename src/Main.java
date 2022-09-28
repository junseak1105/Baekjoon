
import java.util.*;
import java.io.*;

public class Main {


    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] time;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        time = new int[cnt+1]; //건물당 걸리는 시간 저장

        //연결 리스트 구현
        list = new ArrayList[cnt+1];
        for(int i=0;i<cnt+1;i++){
            list[i]= new ArrayList<Integer>();
        }

        //연결리스트에 값 받아오기, -1은 제외함
        for(int i=1;i<cnt+1;i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            time[i]=Integer.parseInt(token.nextToken());
            while(true){
                int temp = Integer.parseInt(token.nextToken());
                if(temp == -1){
                    break;
                }
                list[i].add(temp);
            }
        }

        //cnt만큼 반복
        for(int i=1;i<cnt+1;i++){
            System.out.println("================="+i+"loop==============");
            int result =0;
            visited = new boolean[cnt+1];//방문기록 초기화(노드 별 각자 계산하기 때문)
            Queue que = new LinkedList<Integer>();
            result += time[i]; //시작노드 건물시간 추가

            System.out.print("방문노드:"+i+" 시간값"+time[i]+"\n");

            //시작노드의 연결리스트 값 큐에
            for(int j:list[i]){
                que.add(j);
            }
            //시작노드 방문 체크
            visited[i] = true;

            while(!que.isEmpty()){
                int current = (int)que.poll();

                if(visited[current]){
                    continue;
                }else{
                    result+=time[current];
                    visited[current]=true;
                    System.out.print("방문노드:"+current+" 시간값"+time[current]+"\n");
                    for(int j:list[current]){
                        if(!visited[j]){
                            que.add(j);
                        }
                    }
                }
            }
            System.out.println(result);
        }

    }
}

/*
   5
1. 10 -1
2. 10 1 -1
3. 4 1 -1
4. 4 3 1 -1
5. 3 3 -1
 */