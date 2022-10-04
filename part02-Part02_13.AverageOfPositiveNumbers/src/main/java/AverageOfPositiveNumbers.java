
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum=0, count=0;
        boolean flagHadPositiveInput = false;

        while (true) {
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            if (number > 0) {
                flagHadPositiveInput = true;
                count++;
                sum += number;
            }
        }

        if(flagHadPositiveInput) {
            System.out.println(sum/(count*1.0));
        } else {
            System.out.println("Cannot calculate the average");
        } 
    }
}
