import java.util.Scanner;
public class NegativeBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int remainder;
        String converted = "";
        if (n == 0) {
            System.out.print(0);
        }
        else {
            while (n != 0)
            {
                remainder = n % (-2);
                n /= (-2);
                if (remainder < 0)
                {
                    remainder += 2;
                    n += 1;
                }
                converted = String.valueOf(remainder) + converted;
            }
        }
        System.out.print(converted);
    }
}
