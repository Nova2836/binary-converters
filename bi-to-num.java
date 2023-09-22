import java.util.Scanner;

public class binaCvrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (validateInput(input)) {
            System.out.print("Error: Some characters are not allowed in the input");
        } else {

            char[] arr = input.toCharArray();
            int result = 0;

            for (int i = 0; i < arr.length; i++) {

                int power = (arr.length - (1 + i));
                int c = power;
                int a = arr[i] - '0';
                int b = (int) Math.pow(2, c);

                result += (a * b);
            }
            System.out.print(result);
        }
    }

    public static boolean validateInput(String truDat) {
        for (char c : truDat.toCharArray()) {
            if (Character.isLetter(c) || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
                    || c == '8' || c == '9') {

                return true;
            }
        }
        return false;
    }

}
