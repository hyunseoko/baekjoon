import java.util.Arrays;
import java.util.Scanner;

public class java4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] num = new int[3];
            num[0] = sc.nextInt();
            num[1] = sc.nextInt();
            num[2] = sc.nextInt();
            if(num[0]==num[1] && num[1]==num[2] && num[2]==0){
                System.out.println("");
                break;
            }
            Arrays.sort(num);
            if((num[2]*num[2])==(num[0]*num[0])+(num[1]*num[1])){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}
