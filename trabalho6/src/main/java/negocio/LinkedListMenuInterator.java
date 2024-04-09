package negocio;

public class LinkedListMenuInterator implements IteratorDoIgor<MenuItem> {

    private LinkedListMenu linkedListMenu;
    private int pos;

    public LinkedListMenuInterator() {
        this.linkedListMenu = new LinkedListMenu();
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return this.pos <  this.linkedListMenu.getMenuItems().size();


    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.linkedListMenu.getMenuItems().get(pos);
        pos++;
        return menuItem;
    }

    @Override
    public void add(MenuItem menuItem) {
        this.linkedListMenu.getMenuItems().add(this.linkedListMenu.getMenuItems().size(), menuItem);
    }
    
}
