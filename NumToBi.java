import java.util.Scanner;

public class NumToBi {
    public static void main(String[] args) {
        System.out.println("    \nInsert a number and press 'Enter' to convert it into binary code!");
        System.out.println("    (Attention: '255' is the limit)\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] abc = { 0, 0, 0, 0, 0, 0, 0, 0 };
        if (input != 0) {
            for (int i = 0; i < input; i++) {
                abc[0] = abc[0] + 1;
                for (int j = 0; j < abc.length; j++) {
                    if (abc[j] > 1) {
                        abc[j + 1] = abc[j + 1] + 1;
                        abc[j] = abc[j] - 2;
                    }
                }
            }
        } else {
            for (int l = 0; l < abc.length; l++) {
                System.out.print("0");
            }
        }
        int length = abc.length;
        for (int k = length - 1; k > -1; k--) {
        }
        printResult(abc);
    }

    public static void printResult(int[] arr) {
        boolean flag1 = false;
        int length = arr.length;

        for (int i = length - 1; i > -1; i--) {

            if (arr[i] == 1) {
                flag1 = true;
                System.out.print(arr[i]);
            } else if (flag1 == true) {
                System.out.print(arr[i]);

            } else {
                continue;
            }
        }
    }
}
// Bugs:
// Output error is letters are inputted