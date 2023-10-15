package overhiidingInheritance;

public class overriding
{
    private int id;
    private String name;
    private double sales;
    private double commission;

    public overriding(int id, String name, double sales, double commission)
    {
        setId(id);
        setName(name);
        setSales(sales);
        setCommission(commission);
    }

    public double getEarning()
    {
        return getSales() * getCommission();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSales()
    {
        return sales;
    }

    public void setSales(double sales)
    {
        this.sales = sales;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }
}
