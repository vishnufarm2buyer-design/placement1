package src.com.rest.service;
import java.util.*;
import src.com.rest.models.Table;
import src.com.rest.repository.TableRepository;
public class Tableservices {

    private final TableRepository repository;

    public Tableservices()
    {
        repository = new TableRepository();
    }
    
    public List<Table> getall()
    {
        return repository.show();
    } 

    public void addTable(int id,int cap)
    {
        repository.inserttab(id, cap);
    }

    public void updateTable(int id,int cap)
    {
        repository.editcap(id,cap);
    }

    public void remove(int id)
    {
        repository.removetab(id);
    }
}
