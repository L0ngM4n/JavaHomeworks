import java.util.Scanner;

public class _10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();

        String longer = one.length() >= two.length() ? one : two;
        String shorter = one.length() < two.length() ? one : two;
        int sum = 0;


        for (int i = 0; i < longer.length(); i++) {
            if (i < shorter.length()){
                sum += longer.charAt(i) * shorter.charAt(i);
            } else {
                sum += longer.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
