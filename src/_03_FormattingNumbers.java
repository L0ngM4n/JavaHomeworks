import java.util.Scanner;

public class _03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*
        number b should be printed with 2 digits after the decimal point, right aligned;
         the number c should be printed with 3 digits after the decimal point, left aligned
        |FE        |0011111110|     11.60|0.500     |
         */
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String aHexPadded = String.format("%-10s", Integer.toHexString(a).toUpperCase());
        String aBinary = Integer.toBinaryString(a);


        System.out.printf("|%s|%010d|%10.2f|%-10.3f|",aHexPadded,Integer.parseInt(aBinary),b,c);
    }
}
