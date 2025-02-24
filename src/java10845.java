import java.io.*;

public class java10845 {
    static int[] Queue;
    static int front = 0;
    static int back = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Queue = new int[n+1];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = bf.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;

                case "back":
                    sb.append(back()).append("\n");
            }
        }
        bf.close();
        System.out.print(sb);  // 결과 한 번에 출력 (시간 최적화)
    }

    public static void push(int num) {
        Queue[back++] = num;
    }

    public static int pop() {
        return (back == front)? -1: Queue[front++];
    }

    public static int size() {
        return back - front;
    }

    public static int empty() {
        return (back == front) ? 1 : 0;
    }
    private static int front() {
        return (back == front) ? -1 : Queue[front];
    }
    private static int back() {
        return (back == front) ? -1 : Queue[back-1];
    }
}
