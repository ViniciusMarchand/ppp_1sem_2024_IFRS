package negocio;

public class PancakeHouseMenuIterator implements IteratorDoIgor<MenuItem> {

// public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private PancakeHouseMenu pancakeHouseMenu;
    private int pos;

    public PancakeHouseMenuIterator(){
        this.pancakeHouseMenu = new PancakeHouseMenu();
        this.pos = 0;
    }
    @Override
    public boolean hasNext() {
        return pos < this.pancakeHouseMenu.getMenuItems().size();

    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.pancakeHouseMenu.getMenuItems().get(pos);
        pos++;
        return menuItem;
    }
    @Override
    public void add(MenuItem menuItem) {
        this.pancakeHouseMenu.addItem(menuItem);
    }

}
