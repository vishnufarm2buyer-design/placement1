package src.com.rest.CLI;

import java.util.*;
import src.com.rest.service.PaymentServices;
import src.com.rest.payment.*;
import src.com.rest.models.Payment;;

public class PaymentCLI {

    public void call()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        PaymentServices ps = new PaymentServices();
        do
        {
            System.out.println("1.SHOW PAYMENTS\n2.ADD PAYMENTS\n0.BACK");
            choice = sc.nextInt();
            int id;
            double amount;
            switch (choice) {
                case 1:
                    List<Payment> p = ps.show();
                    for(Payment p1:p) 
                    {
                        System.out.print(p1.paymentid()+" "+p1.getAmount());
                    }
                    break;
                case 2:
                    System.out.println("1.CARD\n2.UPI \n3.CASH");
                    int choose = sc.nextInt();
                    switch (choose) {
                        case 1:
                            id= sc.nextInt();
                            amount = sc.nextDouble();
                            CardPayment p2 = new CardPayment(id,amount);
                            ps.add(p2);
                            p2.pay(amount);
                            break;
                        case 2:
                            id= sc.nextInt();
                            amount = sc.nextDouble();
                            UpiPayment p3 = new UpiPayment(id,amount);
                            ps.add(p3);
                            p3.pay(amount);
                            break;
                        case 3:
                            id= sc.nextInt();
                            amount = sc.nextDouble();
                            CashPayment p4 = new CashPayment(id,amount);
                            ps.add(p4);
                            p4.pay(amount);
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        while(choice!=0);
    }
    
}
