import java.util.Scanner;

public class MinMax {

    // One method that finds and prints both min and max
    public static void findMinAndMax(int[] arr) {
        int smallest = arr[0];
        int largest  = arr[0];

        int i = 1;
        while (i < arr.length) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
            i = i + 1;
        }

        System.out.println("Smallest element = " + smallest);
        System.out.println("Greatest element = " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        // Create array of that size
        int[] numbers = new int[n];

        // Ask user to enter all numbers
        System.out.println("Enter " + n + " numbers:");
        int i = 0;
        while (i < n) {
            numbers[i] = sc.nextInt();
            i = i + 1;
        }

        // Show what user entered (helps checking)
        System.out.println("\nYou entered:");
        i = 0;
        while (i < n) {
            System.out.print(numbers[i] + " ");
            i = i + 1;
        }
        System.out.println("\n");

        // Find and show min + max
        System.out.println("Result:");
        findMinAndMax(numbers);

        sc.close();
    }
}