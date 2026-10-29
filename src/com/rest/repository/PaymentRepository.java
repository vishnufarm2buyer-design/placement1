package src.com.rest.repository;

import java.util.ArrayList;
import java.util.List;

import src.com.rest.payment.*;
import src.com.rest.models.Payment;

public class PaymentRepository 
{
    private final List<Payment> Payments = new ArrayList<>();
    
    public PaymentRepository()
    {
        Payments.add(new CardPayment(1,200));
        Payments.add(new UpiPayment(2,200));
        Payments.add(new CashPayment(3,200));
    }

    public List<Payment> getPayments()
    {
        return Payments;
    }

    public void addPayment(Payment payment)
    {
        Payments.add(payment);
    }
}
