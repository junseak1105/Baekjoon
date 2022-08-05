package Silver_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Queue queue = new LinkedList();
        int lastnum = 0;
        int num = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buffer.readLine());
        String str[] = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            str[i] = buffer.readLine();
        }
        for (int i = 0; i < cnt; i++) {

            switch (str[i]) {
                case "pop":
                    if (queue.peek() != null) {
                        System.out.println(queue.poll());
                        num--;
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (queue.peek() != null) {
                        System.out.println(queue.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if(num>0){
                        System.out.println(lastnum);
                    }else{
                        System.out.println(-1);
                    }
                    
                    break;
                default:
                    lastnum = Integer.parseInt(str[i].substring(5));
                    num++;
                    queue.add(lastnum);
                    break;
            }
        }

    }
}
