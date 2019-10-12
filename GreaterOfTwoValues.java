import java.util.Scanner;

public class GreaterOfTwoValues {

    public static int getMax (int firstNum, int secondNum) {
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("int")) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            int max = getMax(firstNum, secondNum);
            System.out.println(max);
        }

        if (input.equals("char")) {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            char max = getMax(first, second);
            System.out.println(max);
        }

        if (input.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String max = getMax(first, second);
            System.out.println(max);
        }

    }
}
