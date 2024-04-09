package negocio;

public class DinerMenuIterator implements IteratorDoIgor<MenuItem> {

    private DinerMenu dinerMenu;
    private int pos;

    public DinerMenuIterator(){
        this.dinerMenu = new DinerMenu();
        this.pos = 0;
    }

    public DinerMenuIterator(DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < this.dinerMenu.getNumberOfItems();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.dinerMenu.getMenuItems()[pos];
        pos++;
        return menuItem;
    }

    @Override
    public void add(MenuItem menuItem) {
        this.dinerMenu.addItem(menuItem);
    }
    
}
