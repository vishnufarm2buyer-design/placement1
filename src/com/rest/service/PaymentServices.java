package src.com.rest.service;

import src.com.rest.repository.PaymentRepository;
import src.com.rest.models.Payment;
import java.util.List;

public class PaymentServices 
{
    
    private final PaymentRepository payrepository;

    public PaymentServices()
    {
        payrepository=new PaymentRepository();
    }

    public List<Payment> show()
    {
        return payrepository.getPayments();
    }

    public void add(Payment payment)
    {
        payrepository.addPayment(payment);
    }
}
