package src.com.rest.payment;

import src.com.rest.models.Payment;
import src.com.rest.payment.PaymentMethod;

public class CashPayment extends Payment implements PaymentMethod
{
    public CashPayment(int paymentid,double amount)
    {
        super(paymentid,amount);
    }

    @Override 

    public void pay(double amount)
    {
        System.out.println("Paid Rs. " + amount + " using CASH.");
    }
}
