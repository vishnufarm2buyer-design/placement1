package src.com.rest.models;

import java.util.ArrayList;
import java.util.List;
import src.com.rest.models.OrderItem;

public class Order 
{
    private int tableid;
    private int orderid;
    private OrderItem oitem;
    private final List<OrderItem> orderitems = new ArrayList<>();

    public Order(int tableid,int orderid)
    {
        this.tableid=tableid;
        this.orderid=orderid;
    }

    public List<OrderItem> getAll()
    {
        return orderitems;
    }

    public void addItems(OrderItem oitem)
    {
        orderitems.add(oitem);
    }
}
