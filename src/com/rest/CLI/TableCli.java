package src.com.rest.CLI;

import java.util.*;

import src.com.rest.service.Tableservices;
import src.com.rest.models.Table;
public class TableCli {
    
    public void call()
    {
    Scanner sc = new Scanner(System.in);
    int choice;
    Tableservices tr = new Tableservices();
    do
    {
        System.out.println("Table Management.\n 0.BACK \n 1.Display ALL \n 2.addTable \n 3.update \n 4.remove \n");
         choice  = sc.nextInt();
        switch(choice)
        {
            case 1:
                List<Table> pr = tr.getall();
                for(Table t : pr )
                {
                    System.out.println(t.getId()+" "+t.getCapacity());
                }
                break;
            case 2:
                int id  = sc.nextInt();
                int cap = sc.nextInt();
                tr.addTable(id, cap);
                break;
            case 3:
                int id2 = sc.nextInt();
                int cap2 = sc.nextInt();
                tr.updateTable(id2,cap2);
                break;
            case 4:
                int id3= sc.nextInt();
                tr.remove(id3);
                break;
            default:
                break;
                
        }


    }
    while(choice!=0);
}
}
