import java.util.Scanner;
public class Fibonacci2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        //expected input: 1<=N<=80
        long current = 1;
        long temp = 0;
        long previous = 0;
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                //set up such that fib1 = 0, fib2 = 1, etc.
                System.out.println(previous);
                break;
            }
            temp = current;
            current = current + previous;
            previous = temp;
        }
    }
}
