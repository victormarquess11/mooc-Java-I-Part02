
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPosition, secondPosition, text;

        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        

        if (firstNumber > secondNumber) {
            firstPosition = String.valueOf(firstNumber);
            secondPosition = String.valueOf(secondNumber);
            text = "is greater than ";
        } else if (firstNumber < secondNumber){
            firstPosition = String.valueOf(secondNumber);
            secondPosition = String.valueOf(firstNumber);
            text = "is smaller than ";
        } else {
            firstPosition = String.valueOf(firstNumber);
            secondPosition = String.valueOf(secondNumber);
            text = "is equal to ";
        }

        
        System.out.println(firstPosition + text + secondPosition);

    }
}
