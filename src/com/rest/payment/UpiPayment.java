package src.com.rest.payment;

import src.com.rest.models.Payment;
import src.com.rest.payment.PaymentMethod;

public class UpiPayment extends Payment implements PaymentMethod
{
    public UpiPayment(int paymentid,double amount)
    {
        super(paymentid,amount);
    }

    @Override 

    public void pay(double amount)
    {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }
}
