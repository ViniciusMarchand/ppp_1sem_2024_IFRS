package negocio;

import java.util.*;

public class PancakeHouseMenu{

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        this.menuItems = new ArrayList<MenuItem>();
        this.menuItems.add(new MenuItem("Panqueca de arroz", "feita de arroz", 1.99, true));
        this.menuItems.add(new MenuItem("Panqueca de carne", "feita de carne", 10, false));
    }

    public void addItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    

}