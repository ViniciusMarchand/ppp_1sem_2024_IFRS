package negocio;

import java.util.LinkedList;

class LinkedListMenu {
    LinkedList<MenuItem> menuItems;
    
    public LinkedListMenu() {
        this.menuItems = new java.util.LinkedList<MenuItem>();
        this.menuItems.add(new MenuItem("ovo", "ovo de galinha", 2.2, true));
        this.menuItems.add(new MenuItem("ovo frito", "ovo de galinha frito", 3.5, true));

    }
    
    public LinkedList<MenuItem> getMenuItems() {
        return menuItems;
    }

    

    
}
