import java.util.Scanner;

public class _04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double f1 = Math.pow(((Math.pow(a,2d) + Math.pow(b,2d)) /
                (Math.pow(a,2d) - Math.pow(b,2d))),
                ((a+b+c))/Math.sqrt(c));

        double f2 = Math.pow((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3)), (a - b));
        double diff = ((a + b + c)/3) - (f1 + f2 )/2;
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1, f2, Math.abs(diff));
    }
}
