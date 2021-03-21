import java.util.Scanner;
import java.lang.Math;
public class ChessBracket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] totals = input.nextLine().split("\\s+");

        int n = Integer.parseInt(totals[0]);
        int total = (int) Math.pow(2, n);
        int missing = Integer.parseInt(totals[1]);

        int[] players = new int[missing];
        int[] walks = {0};

        for (int i = 0; i < missing; i++) {
            players[i] = input.nextInt();
        }

        if (missing == total || missing == 0) {
            System.out.print(0);
        }
        else {
            countWalkovers(1, total, players, walks);
            System.out.print(walks[0]);
        }
    }
    public static int countWalkovers(int start, int end, int[] players, int[] walks) {
        if (end - start == 1) {
            return thisMatch(start, end, players, walks);
        }
        int distance = (end - start) / 2;
        int game1 = countWalkovers(start, start + distance, players, walks);
        int game2 = countWalkovers(start + distance + 1, end, players, walks);
        if (game1 == 0 && game2 == 0) {
            return 0;
        } else if ((game1 == 0 && game2 == 1) || (game1 == 1 && game2 == 0)) {
            return 0;
        } else if (game1 == 1 && game2 == 1) {
            return 0;
        } else if (game1 == 2 && game2 == 2) {
            return 2;
        }
        walks[0]++;
        return 1;
    }
    public static int thisMatch(int a, int b, int[] players, int[] matches) {
        boolean afound = false;
        boolean bfound = false;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == a) {
                afound = true;
            }
            if (players[i] == b) {
                bfound = true;
            }
        }
        if (afound && bfound) {
            return 2;
        }
        if ((afound && !bfound) || (bfound && !afound)) {
            matches[0] ++;
            return 1;
        }
        else {
            return 0;
        }
    }
}

