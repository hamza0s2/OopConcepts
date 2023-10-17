package InventoryManagement;

public class InventoryManagement extends Requirements{
    Product list[];
    int counter=0;

    public InventoryManagement(int capacity) {
        this.list =new Product[capacity];
    }

    @Override
    public boolean add(Object o) {
        if(counter<list.length) {
            list[counter++] = (Product) o;
            return true;
        }
        return false;
    }

    @Override
    public void remove(Object o)
    {
        if (o instanceof Product)
        {
            Product p = (Product) o;
            for (int i = 0; i < list.length; i++)
            {
                if (list[i] != null && list[i].equals(p))
                {
                    list[i] = null;
                    break;
                }
            }
        }
        return;
    }


    public void displayList(){
        for(Product p:list)
            if(p!=null)
            {
                System.out.println(p);
            }
    }
}
