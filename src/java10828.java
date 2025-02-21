import java.io.*;

public class java10828 {
    static int[] stack;  // 스택을 저장할 배열
    static int count = -1;  // 스택의 가장 위(Top)를 가리키는 변수

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        stack = new int[n];  // 입력 개수만큼 스택 크기 설정
        StringBuilder sb = new StringBuilder();  // 빠른 출력

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
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        bf.close();
        System.out.print(sb);  // 결과 한 번에 출력 (시간 최적화)
    }

    public static void push(int num) {
        stack[++count] = num;  // count 증가 후 해당 위치에 값 저장
    }

    public static int pop() {
        if (count == -1) return -1;  // 스택이 비어있으면 -1 반환
        return stack[count--];  // 현재 count 위치의 값 반환 후 count 감소
    }

    public static int size() {
        return count + 1;  // count는 0부터 시작하므로 +1
    }

    public static int empty() {
        return (count == -1) ? 1 : 0;
    }

    public static int top() {
        if (count == -1) return -1; // 스택이 비어있으면 -1 반환
        return stack[count];  // 현재 count 위치의 값 반환
    }
}
