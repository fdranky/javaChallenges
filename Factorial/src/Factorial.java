import java.util.Scanner;

/**
 * Created by hoecakenux on 13.12.17.
 */
public class Factorial {

    public static long factorial(int f) {
        long factSum = 1;
        while(f > 0) {
            System.out.println(
                    "Current factSum: " + factSum +
                    " Current f: " + f);
            factSum *= f;
            f--;
        }
        System.out.println("Finished run\n");
        return factSum;
    }

    public static void main(String[] args) {
        System.out.println("Input int to factor until!");
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();

        for(int i = 0; i < j; i++) {
            factorial(i);
        }
    }
}
