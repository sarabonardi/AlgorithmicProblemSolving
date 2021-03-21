import java.util.Scanner;
public class RodSculpture {
    public static void main(String[] args) {
        //from L-i to 1, the rod can be bent to be parallel with y or z
        //this can be in the positive or negative direction
        //solution is to print final direction of rod tip
        Scanner input = new Scanner(System.in);
        String Lin = input.nextLine();
        //takes length L in first input line
        int L = Integer.parseInt(Lin);
        String in = input.nextLine();
        //second input line is all instructions separated by spaces
        String[] instructions = in.trim().split("\\s+");
        int position = 1;
        //rod begins pointing to +x, from (0, 0, 0) to (L, 0, 0)
        //positions are as follows:
        //+x = 1, +y = 2, +z = 3
        //-x = 4, -y = 5, -z = 6
        int z = 0;
        for (int i = 0; i < instructions.length; i++) {
            if (instructions[i].compareTo("No") == 0) {
                continue;
            }
            else if (instructions[i].compareTo("+y") == 0) {
                switch(position) {
                    case 1:
                        position = 2;
                        break;
                    case 2:
                        position = 4;
                        break;
                    case 3: case 6: default:
                        break;
                    case 4:
                        position = 5;
                        break;
                    case 5:
                        position = 1;
                        break;
                }
            }
            else if (instructions[i].compareTo("-y") == 0) {
                switch(position) {
                    case 1:
                        position = 5;
                        break;
                    case 2:
                        position = 1;
                        break;
                    case 3: case 6: default:
                        break;
                    case 4:
                        position = 2;
                        break;
                    case 5:
                        position = 4;
                        break;
                }
            }
            else if (instructions[i].compareTo("+z") == 0) {
                switch(position) {
                    case 1:
                        position = 3;
                        break;
                    case 2: case 5: default:
                        break;
                    case 3:
                        position = 4;
                        break;
                    case 4:
                        position = 6;
                        break;
                    case 6:
                        position = 1;
                        break;
                }
            }
            else if (instructions[i].compareTo("-z") == 0) {
                switch(position) {
                    case 1:
                        position = 6;
                        break;
                    case 2: case 5: default:
                        break;
                    case 3:
                        position = 1;
                        break;
                    case 4:
                        position = 3;
                        break;
                    case 6:
                        position = 4;
                        break;
                }
            }
        }
        switch(position) {
            case 1:
                System.out.print("+x");
                break;
            case 2:
                System.out.print("+y");
                break;
            case 3:
                System.out.print("+z");
                break;
            case 4:
                System.out.print("-x");
                break;
            case 5:
                System.out.print("-y");
                break;
            case 6:
                System.out.print("-z");
                break;
            default:
                break;
        }
    }
}
