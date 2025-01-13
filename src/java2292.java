import java.util.Scanner;
//벌집
public class java2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;
        int num = 1;
        for(int i = 1; i <= N; i++) {
            num += i*6;
            if (N == 1) break;
            else if(num<N) result += 1;
            else {
                result += 1;
                break;
            }
        }
        System.out.println(result);
    }
}
