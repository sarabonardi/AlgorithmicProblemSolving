import java.util.Scanner;
public class EvenColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tot = input.nextLine();
        String in = input.nextLine();
        String[] columns = in.trim().split("\\s+");
        int[] out = new int[columns.length];
        for (int i = 0; i < columns.length; i++) {
            out[i] = Integer.parseInt(columns[i]);
        }
        int done = countMoves(out);
        System.out.println("The minimum number of moves is " + done + ".");
    }
    public static int countMoves(int[] a) {
        int counter = 0;
        int moves = 0;
        for (int i = 0; i < a.length; i++) {
            counter += a[i];
        }
        int each = counter / a.length;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > each) {
                moves += a[j] - each;
            }
        }
        return moves;
    }
}
