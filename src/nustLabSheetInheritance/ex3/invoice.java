package nustLabSheetInheritance.ex3;

public class invoice
{
    private String PartNumber;
    private String PartDescription;
    private int Quantity;
    private double Price;

    public invoice(String partNumber, String partDescription, int quantity, double price)
    {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setPartDescription(String partDescription)
    {
       this.PartDescription =  partDescription;
    }

    public void setPartNumber(String partNumber)
    {
        this.PartNumber = partNumber;
    }

    public void setQuantity(int quantity)
    {
        if(quantity>=0)
        {
            this.Quantity = quantity;
        }
        else
        {
            this.Quantity = 0;
        }
    }

    public void setPrice(double price)
    {
        if (price>=0)
        {
            this.Price = price;
        }
        else
        {
            this.Price = 0.0;
        }
    }

    public String getPartNumber()
    {
        return PartNumber;
    }
    public String getPartDescription()
    {
        return PartDescription;
    }
    public int getQuantity()
    {
        return Quantity;
    }
    public double getPrice()
    {
        return Price;
    }

    public static double InvoiceIncome(int quantity, double price)
    {
        double Total = quantity * price;
        return Total;
    }



}
