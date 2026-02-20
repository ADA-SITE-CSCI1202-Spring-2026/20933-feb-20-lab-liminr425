import java.util.Scanner;

public class MinMax {

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

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        int i = 0;
        while (i < n) {
            numbers[i] = sc.nextInt();
            i = i + 1;
        }

        System.out.println("\nYou entered:");
        i = 0;
        while (i < n) {
            System.out.print(numbers[i] + " ");
            i = i + 1;
        }
        System.out.println("\n");
        System.out.println("Result:");
        findMinAndMax(numbers);

        sc.close();
    }
}