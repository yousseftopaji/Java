import java.util.Scanner;

public class Exercise8
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input purchase details
    System.out.print("Enter the number of shares purchased: ");
    int sharesPurchased = scanner.nextInt();
    System.out.print("Enter the purchase price per share: ");
    double purchasePricePerShare = scanner.nextDouble();
    System.out.print("Enter the commission rate for purchase (as a decimal): ");
    double purchaseCommissionRate = scanner.nextDouble();

    // Input sale details
    System.out.print("Enter the number of shares sold: ");
    int sharesSold = scanner.nextInt();
    System.out.print("Enter the sale price per share: ");
    double salePricePerShare = scanner.nextDouble();
    System.out.print("Enter the commission rate for sale (as a decimal): ");
    double saleCommissionRate = scanner.nextDouble();

    // Calculations
    double amountPaidForStock = sharesPurchased * purchasePricePerShare;
    double purchaseCommission = amountPaidForStock * purchaseCommissionRate;
    double amountReceivedFromSale = sharesSold * salePricePerShare;
    double saleCommission = amountReceivedFromSale * saleCommissionRate;
    double profit = amountReceivedFromSale - saleCommission - amountPaidForStock - purchaseCommission;

    // Display results
    System.out.printf("Amount paid for the stock: $%.2f%n", amountPaidForStock);
    System.out.printf("Commission paid on purchase: $%.2f%n", purchaseCommission);
    System.out.printf("Amount received from sale: $%.2f%n", amountReceivedFromSale);
    System.out.printf("Commission paid on sale: $%.2f%n", saleCommission);
    System.out.printf("Profit after commissions: $%.2f%n", profit);

    scanner.close();
  }
}