package nustLabSheetInheritance.ex3;
import java.util.Scanner;
public class TestApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Part Number: ");
        String PartNumber = input.nextLine();
        System.out.print("Enter the Part Description: ");
        String PartDescription = input.nextLine();
        System.out.print("Enter the Quantity of items purchased: ");
        int Quantity = input.nextInt();
        System.out.print("Enter the Price per item: ");
        double Price = input.nextDouble();

        invoice firstItem = new invoice(PartNumber,PartDescription,Quantity,Price);

        System.out.println("The total is: " + invoice.InvoiceIncome(firstItem.getQuantity(), firstItem.getPrice()));



    }
}
