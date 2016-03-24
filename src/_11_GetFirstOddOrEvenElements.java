import java.util.Arrays;
import java.util.Scanner;

public class _11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] commands = scanner.nextLine().split(" ");

        System.out.print(getNumbers(line, commands));
    }

    private static String getNumbers (String line, String[] commands){
        String numbers = "";
        int[] arr = Arrays.stream(line.substring(0, line.length()).split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int parity = commands[2].equals("odd") ? 1 : 0;
        int get = Integer.parseInt(commands[1]);

        for (int i = 0, counter = 0; i < arr.length; i++) {
            if (arr[i] % 2 == parity) {
                numbers += arr[i] + " ";
                counter++;
                if (counter > get) {
                    break;
                }
            }
        }

        return numbers;
    }
}