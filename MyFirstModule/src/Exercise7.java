public class Exercise7
{
  public static void main (String[] args)
  {
    int sharesPurchased = 1000;
    double purchasePricePerShare = 32.87;
    double purchaseCommissionRate = 0.02;

    // Sale details
    int sharesSold = 1000;
    double salePricePerShare = 33.92;
    double saleCommissionRate = 0.02;

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
  }
}
