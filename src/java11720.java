import java.util.Scanner;
//숫자의 합
public class java11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        String input = scanner.nextLine();
        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += input.charAt(i) - '0';
        }
        System.out.println(sum);
        scanner.close();
    }
}
