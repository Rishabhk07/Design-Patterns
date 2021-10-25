package chapter9_iterator_composite;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("some menu item from Diner", "description", true, 2.99);
    }

    public void addItem(String name, String descrption, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, descrption, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry! Menu is Full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }
}
