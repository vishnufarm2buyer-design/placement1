package src.com.rest.models;

import src.com.rest.models.Menu;

public class OrderItem 
{
    private int menuid;
    private int quantity;
    private double price;
    private String foodName;

    public OrderItem(int menuid,int quantity,double price,String foodName)
    {
        this.menuid=menuid;
        this.quantity=quantity;
        this.price=price;
        this.foodName=foodName;
    }

    public int getmenuid()
    {
        return menuid;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getName()
    {
        return foodName;
    }

    public double getsubtotal()
    {
        return quantity*price;
    }

}
