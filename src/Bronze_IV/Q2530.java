package Bronze_IV;
import java.util.Scanner;

public class Q2530 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int si = in.nextInt();
        int bun = in.nextInt();
        int cho = in.nextInt();
        int time = in.nextInt();
        
        //1분은 60초 걸리는 시간에 60을 나눠서 나온 몫은 분에 나머지는 초에 합산
        bun+=time/60;
        cho+=time%60;
        //초를 60아래로 정리하기 위해 나눈 몫을 분에 나머지는 초에 대입
        bun+=cho/60;
        cho=cho%60;
        //분을 60분아래로 정리하기 위해 나눈 몫을 분에 합산 나머지는 초에 대입
        si+=bun/60;
        bun=bun%60;
        //시가 24이상이 될 수 있기에 24로 나눠 나머지만 대입
        si=si%24;
        System.out.println(si+" "+bun+" "+cho);

    }
}
