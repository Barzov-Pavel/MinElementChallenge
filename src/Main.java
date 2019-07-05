import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isInt = false;
        int count = 0;

        while (!isInt) {
            System.out.println("Enter size of array.");
            isInt = scanner.hasNextInt();

            if (isInt) {
                count = scanner.nextInt();
            }
            scanner.nextLine();
        }

        int[] mainArray = readIntegers(count);

        System.out.println("Minimum elemen in array is " + findMin(mainArray));

        scanner.close();
    }

    private static int[] readIntegers(int count) {
        int[] localArray = new int[count];

        for (int i = 0; i < count; i++) {
            boolean isTrue = false;

            while (!isTrue) {
                System.out.println("Enter " + i + " integer");
                isTrue = scanner.hasNextInt();

                if (isTrue) {
                    localArray[i] = scanner.nextInt();
                }
                scanner.nextLine();
            }
        }

        return localArray;
    }

    private static int findMin(int[] array) {
        int len = array.length - 1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {

            if (array[i] > array[i + 1]) {
                min = array[i + 1];
            }
        }

        return min;
    }
}
