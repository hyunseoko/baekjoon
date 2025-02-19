import java.io.*;

public class java28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        String result = "";

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        boolean isaNumeric = a.matches("-?\\d+(\\.\\d+)?");
        boolean isbNumeric = b.matches("-?\\d+(\\.\\d+)?");
        boolean iscNumeric = c.matches("-?\\d+(\\.\\d+)?");

        if (isaNumeric) {
            i = Integer.parseInt(a) + 3;
        }
        if (isbNumeric) {
            i = Integer.parseInt(b) + 2;
        }
        if (iscNumeric) {
            i = Integer.parseInt(c) + 1;
        }

        if (i % 3 == 0 && i % 5 == 0) {
            result = "FizzBuzz";
            System.out.println(result);
        } else if (i % 3 == 0) {
            result = "Fizz";
            System.out.println(result);
        } else if (i % 5 == 0) {
            result = "Buzz";
            System.out.println(result);
        } else {
            System.out.println(i);
        }
    }
}
