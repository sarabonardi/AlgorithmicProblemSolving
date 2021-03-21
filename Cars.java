import java.util.Scanner;
public class Cars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String deets = input.nextLine();
        String[] specs = deets.trim().split("\\s+");
        int duration = Integer.parseInt(specs[0]);
        double down = Double.parseDouble(specs[1]);
        double loan = Double.parseDouble(specs[2]);
        double worth = loan + down;
        int records = Integer.parseInt(specs[3]);
        int done = 1;
        double decrement = (double) (loan / duration);
        boolean matched = true;
        String[] current = input.nextLine().trim().split("\\s+");
        double rate = Double.parseDouble(current[1]);
        /* starting at month 0 with first depreciation
        calculated but no loan payments made */
        for (int i = 0; i < duration + 1; i ++) {
            if (i == Integer.parseInt(current[0])) {
                rate = Double.parseDouble(current[1]);
                if (done != records) {
                    matched = true;
                }
                else {
                    matched = false;
                }
            }
            worth *= (1 - rate);
            if (loan < worth) {
                if (i == 1) {
                    System.out.println("1 month");
                }
                else {
                    System.out.println(i + " months");
                }
                break;
            }
            if (matched) {
                current = input.nextLine().trim().split("\\s+");
                if (i == Integer.parseInt(current[0])) {
                    rate = Double.parseDouble(current[1]);
                    if (done != records) {
                        matched = true;
                    }
                    else {
                        matched = false;
                    }
                } else {
                    matched = false;
                    done++;
                }
            }
            loan -= decrement;
        }
    }
}
