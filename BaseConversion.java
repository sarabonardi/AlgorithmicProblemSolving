import java.util.Scanner;
public class BaseConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String[] parameters = in.trim().split("\\s+");
        String initial = parameters[2];
        int inbase = Integer.parseInt(parameters[0]);
        int outbase = Integer.parseInt(parameters[1]);
        char current = 0;
        int tester = 0;
        String result = "";
        boolean possible = true;
        if (initial.compareTo("0") == 0) {
            System.out.print("0 base " + inbase + " = 0 base " + outbase);
        }
        else {
            if (inbase > 16 || inbase < 2) {
                possible = false;
            }
            else if (inbase <= 10) {
                for (int i = 0; i < initial.length(); i++) {
                    if (!(initial.charAt(i) >= '0' && initial.charAt(i) < ('0' + inbase))) {
                        possible = false;
                    }
                }
            }
            else {
                for (int i = 0; i < initial.length(); i++) {
                    if (!((initial.charAt(i) >= '0' && initial.charAt(i) < ('0' + inbase)) || (initial.charAt(i) >= 'A' && initial.charAt(i) < ('A' + inbase - 10)))) {
                        possible = false;
                    }
                }
            }
            if (possible == true) {
                result = switchBase(initial, inbase, outbase);
                System.out.print(initial + " base " + inbase + " = " + result + " base " + outbase);
            }
            else {
                System.out.print(initial + " is an illegal base " + inbase + " number");
            }
        }
    }
    public static String switchBase(String i, int inbase, int outbase) {
        String result = Long.toString(Long.parseLong(i, inbase), outbase);
        result = result.toUpperCase();
        return result;
    }
}