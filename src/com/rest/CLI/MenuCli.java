package src.com.rest.CLI;

import java.util.Scanner;
import java.util.List;
import src.com.rest.service.Menuservices;
import src.com.rest.models.Menu;

public class MenuCli {

    public void call()
    {
        Scanner sc = new Scanner(System.in);
        Menuservices menu = new Menuservices();
        int choice;
        do
        {
            System.out.println("Menu Management \n1.Show \0.BACK");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    List<Menu> m = menu.show();
                    for(Menu mt : m)
                    {
                        System.out.println(mt.getId()+" "+mt.getName()+" "+mt.getPrice());
                    }
                    break;
            
                default:
                    break;
            }
        }
        while (choice!=0);
    }
    
}
