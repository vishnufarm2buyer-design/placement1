package src.com.rest.payment;

import src.com.rest.models.Payment;

public class CardPayment extends Payment implements PaymentMethod
{
    public CardPayment(int paymentid,double amount)
    {
        super(paymentid,amount);
    }

    @Override 

    public void pay(double amount)
    {
        System.out.println("Paid Rs. " + amount + " using Card.");
    }
}
