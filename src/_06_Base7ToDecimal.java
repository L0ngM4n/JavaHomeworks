import java.util.Scanner;

public class _06_Base7ToDecimal {
    public static void main(String[] args) {
        while (true){

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        Integer decimalNum = Integer.valueOf(number,7);
            System.out.print(" " +decimalNum);
            System.out.println();
        }
    }
}
