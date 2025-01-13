import java.util.Scanner;
//달팽이는 올라가고 싶다
public class java2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int count = (V-A)/(A-B) + 1;
        if (((V-A)%(A-B))!=0) count+=1;
        System.out.println(count);
    }
}