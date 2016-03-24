import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _07_RandomizeNums {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int smaller = Math.min(n, m);
        int bigger = Math.max(n, m);
        List<Integer> nums = new ArrayList<>();
        Random  randomGenerator = new Random();

        for (int i = smaller; i <= bigger; i++) {
            Integer current = randomGenerator.nextInt(bigger - smaller + 1) + smaller;

            while (nums.contains(current)) {
                current = randomGenerator.nextInt(bigger - smaller + 1) + smaller;
            }
            nums.add(current);
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
