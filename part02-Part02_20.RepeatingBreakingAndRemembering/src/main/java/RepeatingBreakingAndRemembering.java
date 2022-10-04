
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int number, sum=0, counter=0, even=0, odd=0;

        while (true) {

            System.out.println("Give numbers:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2.0 == 0){
                even++;
            }

            if (number % 2.0 == 1){
                odd++;
            }

            sum += number;
            counter++;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (sum/(counter*1.0)) );
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}
