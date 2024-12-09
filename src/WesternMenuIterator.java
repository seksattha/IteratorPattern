import java.util.List;

public class WesternMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public WesternMenuIterator(List<MenuItem> menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;

        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;

    }
}
