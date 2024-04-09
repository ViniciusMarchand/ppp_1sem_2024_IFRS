package negocio;

public class DinerMenuIteratorReverse implements IteratorDoIgor<MenuItem> {
    private DinerMenu dinerMenu;
    private int pos;

    public DinerMenuIteratorReverse(){
        this.dinerMenu = new DinerMenu();
        this.pos = dinerMenu.getNumberOfItems()-1;
    }

    @Override
    public boolean hasNext() {
        return pos >= 0;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.dinerMenu.getMenuItems()[pos];
        pos--;
        return menuItem;
    }

    @Override
    public void add(MenuItem menuItem) {
        this.dinerMenu.addItem(menuItem);
    }
    
}
