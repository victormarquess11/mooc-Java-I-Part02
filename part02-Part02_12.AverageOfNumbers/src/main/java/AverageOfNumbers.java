
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, average, count=0, sum=0;

        while (true) {

            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            count++;
            sum += number;
        }

        System.out.println("Average of the numbers: " + (sum/(count*1.0)) );

    }
}
