import java.util.Scanner;
public class EndianReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        /* for non two's complement:
        int output;
        int chunk1 = (0xFF & in) << 24;
        int chunk2 = (0xFF00 & in) << 16;
        int chunk3 = (0xFF0000 & in) << 8;
        int chunk4 = (0xFF000000 & in) << 0;
        output = (chunk1 | chunk2 | chunk3 | chunk4); */
        int output = Integer.reverseBytes(in);
        System.out.print(in + " converts to " + output);
    }
}
