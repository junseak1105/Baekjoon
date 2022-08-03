package Silver_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11650 {

    int x;
    int y;

    public Q11650(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());
        ArrayList list = new ArrayList();

        for (int i = 0; i < cnt; i++) {
            String str = buffer.readLine();
            StringTokenizer token = new StringTokenizer(str);
            int xc = Integer.parseInt(token.nextToken());
            int yc = Integer.parseInt(token.nextToken());
            list.add(new Q11650(xc, yc));
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Q11650 ic = (Q11650) list.get(i);
                Q11650 jc = (Q11650) list.get(j);
                // x비교
                if (ic.x > jc.x) {// x 클시 위치 변경
                    list.set(i, jc);
                    list.set(j, ic);
                } else if (ic.x == jc.x) {// x동일 시
                    if (ic.y > jc.y) {// x는 동일하고 y는 클시 위치 변경, 아니면 그대로
                        list.set(i, jc);
                        list.set(j, ic);
                    }
                }
            }
        }
        System.out.println("----------------");
        for (int i = 0; i < list.size(); i++) {
            Q11650 mn = (Q11650) list.get(i);
            System.out.println(mn.x + " " + mn.y);
        }
    }
}
