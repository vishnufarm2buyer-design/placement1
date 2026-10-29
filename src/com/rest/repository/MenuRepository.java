package src.com.rest.repository;

import java.util.ArrayList;
import java.util.List;
import src.com.rest.models.Menu;

public class MenuRepository {

    private final List<Menu> Menus = new ArrayList<>();

    public MenuRepository()
    {
        Menus.add(new Menu(101,"Biryani",100.30));
        Menus.add(new Menu(102,"Chapathi",20.30));
    }
    
    public List<Menu> listall()
    {
        return Menus;
    }
}
