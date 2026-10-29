package src.com.rest.models;

import src.com.rest.models.Table.Availability;

public class Menu {

    private enum MenuAvailability{
        Available,NotAvailable
    }

    private int menuid;
    private String menuname;
    private MenuAvailability status;
    private double menuprice;

    public Menu(int id,String name,double price)
    {
        this.menuid=id;
        this.menuname=name;
        this.menuprice=price;
    }

    public int getId()
    {
        return menuid;
    }
    public String getName()
    {
        return menuname;
    }

    public double getPrice()
    {
        return menuprice;
    }

    public void NotAvailable()
    {
        status=status.NotAvailable;
    }

    public void Available()
    {
        status=status.Available;
    }

    public MenuAvailability getAvailability()
    {
        return status;
    }

    
}
