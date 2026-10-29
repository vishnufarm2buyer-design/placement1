package src.com.rest.service;

import java.util.List;
import src.com.rest.repository.MenuRepository;
import src.com.rest.models.Menu;

public class Menuservices {

    private final MenuRepository repo;

    public Menuservices()
    {
        repo = new MenuRepository();
    }

    public List<Menu> show()
    {
        return repo.listall();
    }
    
}
