
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        if (number > 100){
            for (int i=100; i>=number; i--) {
                System.out.println(i);
            }
        }
        if (number < 100){
            for (int i=number; i<=100; i++) {
                System.out.println(i);
            }
        }
        if (number == 100) {
            System.out.println(number);
        }
        

    }
}
