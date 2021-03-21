import java.util.Scanner;
public class Add2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long res = Long.valueOf(input.nextInt()) + Long.valueOf(input.nextInt());
        System.out.println(res);
    }
}
