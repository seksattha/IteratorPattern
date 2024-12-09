import java.util.ArrayList;

import java.util.List;

public class WesternHouseMenu {
    List<MenuItem> menuItems;

    public WesternHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("Cheese Burger", 199);
        addItem("Double Cheese Burger", 249);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new WesternMenuIterator(menuItems);
    }




}
