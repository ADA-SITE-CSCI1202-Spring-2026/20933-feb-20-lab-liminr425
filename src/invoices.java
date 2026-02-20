import java.util.Scanner;

public class invoices {

    static class Invoice {
        String partNumber;
        String partDescription;
        int quantity;
        double pricePerItem;


        Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.quantity = quantity;
            this.pricePerItem = pricePerItem;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice #" + (i + 1));

            System.out.print("Part number: ");
            String number = sc.nextLine();

            System.out.print("Part description: ");
            String desc = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine();

            invoices[i] = new Invoice(number, desc, qty, price);
        }

        System.out.println("Invoice Amounts");
        for (Invoice inv : invoices) {
            double amount = inv.quantity * inv.pricePerItem;
            System.out.println(inv.partDescription + " (" + inv.partNumber + "): $" + amount);
        }

        sc.close();
    }
}