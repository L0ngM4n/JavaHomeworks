import java.util.Arrays;
import java.util.Scanner;

public class _08_OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int[] array = Arrays.stream(line.substring(0, line.length()).split(" "))
                .mapToInt(Integer::parseInt).toArray();

        if (array.length % 2 == 0) {

            for (int i = 0; i < array.length - 1; i+=2) {
                String text;
                int curr = array[i];
                int second = array[i + 1];
                int currParity = curr % 2 == 0 ? 0 : 1;
                int nextParity = second % 2 == 0 ? 0 : 1;
                if (currParity == nextParity) {
                    text = "both are " + (currParity == 0 ? "even" : "odd");
                } else {
                    text = "different";
                }

                System.out.printf("%d, %d -> %s\n",curr, second, text);
            }

        } else {
            System.out.println("Invalid length");

        }
        System.out.println();

    }
}
