package Bronze_I;

import java.util.*;

public class Q1268 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int cnt = 0;
        int who = 1;
        int i=0;
        int stunum = in.nextInt();
        int[][] arr = new int[stunum][5];

        //입력받기
        for (i = 0; i < stunum; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //비교연산
        i=0;
        for (i = 0; i < stunum; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < stunum; k++) {
                    if(arr[i][j]==arr[k][j]&&k!=i){
                        cnt++;
                    }
                }
            }
            //최대매칭자 등록
            if (max < cnt) {
                max = cnt;
                who = i+1;
            }
            //System.out.println("max:"+max+" cnt:"+cnt+" who:"+who);
            cnt = 0;
        }
        System.out.println(who);
        
    }
}
//다른사람 정답
/* 
package Bronze_I;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.*;

public class Q1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[5][N];

        Set[] dupCheckSet = new Set[N];
        int max = 0, answer = 1;

        for (int j = 0; j < N; j++) {
            dupCheckSet[j] = new HashSet();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 5; i++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            Map<Integer, List<Integer>> stuClsMap = new HashMap<>();

            for (int j = 0; j < N; j++) {
                List<Integer> value = stuClsMap.getOrDefault(arr[i][j], new ArrayList<>());
                value.add(j);

                stuClsMap.put(arr[i][j], value);
            }

            for (Entry<Integer, List<Integer>> entry : stuClsMap.entrySet()) {
                if (entry.getValue().size() > 1) {
                    for (int stuN : entry.getValue()) {
                        dupCheckSet[stuN].addAll(entry.getValue());
                        dupCheckSet[stuN].remove(stuN);
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (dupCheckSet[i].size() > max) {
                max = dupCheckSet[i].size();
                answer = i + 1;
            }
        }

        System.out.println(answer);
    }
}
*/