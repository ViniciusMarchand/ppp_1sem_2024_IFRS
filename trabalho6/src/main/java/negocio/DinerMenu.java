package negocio;

class DinerMenu {
    private static final int MAX_ITEMS = 4;
    private int numberOfItems;
    private MenuItem[] menuItems;

    public DinerMenu(){
        this.numberOfItems = 0;
        this.menuItems = new MenuItem[MAX_ITEMS];
        this.menuItems[0] = new MenuItem("Ala minuta", "bifé", 20, false);
        this.numberOfItems++;
        this.menuItems[1] = new MenuItem("Bauru de filé", "feito de filé", 50, false);
        this.numberOfItems++;
        
    }

    public void addItem(MenuItem menuItem){
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("deu xabum! não entra mais ninguém no morro!");
        } else {
            this.menuItems[numberOfItems] = menuItem;
            this.numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public static int getMaxItems() {
        return MAX_ITEMS;
    }
}
