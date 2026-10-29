package src.com.rest.models;

public class Payment
{
    protected int paymentid;
    protected double amount;

    public Payment(int paymentid,double amount)
    {
        this.paymentid=paymentid;
        this.amount=amount;
    }
    
    public double getAmount()
    {
        return amount;
    }

    public int paymentid()
    {
        return paymentid;
    }

}
