package negocio;

import java.util.HashMap;
import java.util.Map;

class CafeMenu {
    private Map<Integer, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new HashMap<Integer, MenuItem>();
        this.menuItems.put(0, new MenuItem("cafe", "feito de café", 1, true));
        
    }

    public Map<Integer, MenuItem> getMenuItems() {
        return menuItems;
    }
    
    

    
}
