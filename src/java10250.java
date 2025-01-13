import java.util.Scanner;
//ACM 호텔
public class java10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int room;
            if (N%H==0) room = H*100 + N/H;
            else room = (N%H)*100 + (N/H) + 1;
            System.out.println(room);
        }
    }
}