import java.util.Scanner;

public class java2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []num = new int[n];
        int sum = 0;

        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[n-1];

        for (int i=0; i<n; i++) {
            sum+=num[i];
            for(int j=0; j<n; j++) {
                if(i==j) continue;
                sum += num[j];
                for (int k=0; k<n; k++) {
                    if (k==j || i==k) continue;
                    sum += num[k];
                    if (sum >= max && sum <= m) max = sum;
                    sum = num[i]+num[j];
                }
                sum = num[i];
            }
            sum = 0;
        }
        System.out.println(max);
    }
}
