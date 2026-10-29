import java.util.*;

import src.com.rest.CLI.*;

public class Main 
{
    public static void main(String[] args)
    {
        TableCli clitab = new TableCli();
        Scanner sc = new Scanner(System.in);
        MenuCli climenu = new MenuCli();
        PaymentCLI clipay = new PaymentCLI();
        int choice;
        do{
            System.out.println("0.Exit \n1.Table Management. \n2.Menu Management \n3.Payment");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    clitab.call();
                    break;
                case 2:
                    climenu.call();
                    break;
                case 3:
                    clipay.call();
                default:
                    break;
            }
        } 
        while(choice!=0);
    }
}
