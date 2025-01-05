import java.util.Scanner;

public class java2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int w_H = H;
        int w_M = M;
        if(M<45){
            if(H==0) w_H = 23;
            else w_H -= 1;

            w_M = M-45+60;
        }
        else {
            w_M -= 45;
        }
        System.out.println(w_H + " " + w_M);
        sc.close();
    }
}