import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        //expected input: 1<=N<=40
        int current = 1;
        int temp = 0;
        int previous = 0;
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                //set up such that fib1 = 1, fib2 = 1, etc.
                System.out.println(current);
                break;
            }
            temp = current;
            current = current + previous;
            previous = temp;
        }
    }
}
