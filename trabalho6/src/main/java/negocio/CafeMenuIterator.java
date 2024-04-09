package negocio;

public class CafeMenuIterator implements IteratorDoIgor<MenuItem> {

    private CafeMenu cafeMenu;
    private int pos;

    public CafeMenuIterator() {
        this.cafeMenu = new CafeMenu();
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return this.pos <  this.cafeMenu.getMenuItems().size();


    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.cafeMenu.getMenuItems().get(pos);
        pos++;
        return menuItem;
    }

    @Override
    public void add(MenuItem menuItem) {
        this.cafeMenu.getMenuItems().put(this.cafeMenu.getMenuItems().size(), menuItem);
    }
    
}
