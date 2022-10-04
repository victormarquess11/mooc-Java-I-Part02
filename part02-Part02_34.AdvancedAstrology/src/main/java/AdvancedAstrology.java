
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        printWhatever(number, "*");
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        printWhatever(number, " ");
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        printTriangleComplete(height);
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void printWhatever(int number, String character) {
        for (int i = 1; i <= number; i++) {
            System.out.print(character);
        }
    }

    public static void printTriangleComplete(int size) {
        int sideStars = 0;
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i+sideStars);
            sideStars++;
        }
    }


    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
