package src.com.rest.repository;

import java.util.ArrayList;
import java.util.List;
import src.com.rest.models.Table;
public class TableRepository 
{
    private final List<Table> tables = new ArrayList<>();
    
    public TableRepository()
    {
        tables.add(new Table(1, 5));
        tables.add(new Table(2, 5));
        tables.add(new Table(3, 5));
    }

    public void inserttab(int id,int cap)
    {
        tables.add(new Table(id, cap));
    }

    public List<Table> show()
    {
        return tables;
    }

    public void editcap(int id,int cap)
    {
        for(Table t : tables)
        {
            if(t.getId()==id)
            {
                t.upcapacity(cap);
            }
        }
    }
    public void removetab(int id)
    {
        for(Table t:tables)
        {
            if(t.getId()==id)
            {
                tables.remove(t);
            }
        }
    }
}
